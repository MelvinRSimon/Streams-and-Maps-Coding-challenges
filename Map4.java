//Write a program to merge two maps. If a key exists in both maps, combine their values.

import java.util.*;

public class Map4 {
    public static void main(String[] args) {
        Map<String, Integer> myMap1 = new HashMap<>();
        myMap1.put("M", 1);
        myMap1.put("E", 2);
        myMap1.put("L", 3);
        myMap1.put("V", 4);

        Map<String, Integer> myMap2 = new HashMap<>();
        myMap2.put("L", 5);
        myMap2.put("V", 6);
        myMap2.put("I", 7);
        myMap2.put("N", 8);

        for (String key : myMap2.keySet()) {
            if (myMap1.containsKey(key)) {
                myMap1.put(key, myMap1.get(key) + myMap2.get(key));
            } else {
                myMap1.put(key, myMap2.get(key));
            }
        }

        System.out.println("Merged map: " + myMap1);
    }
}
