//Create a program that checks whether a given key exists in a map. If it exists, print the value.

import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("M", 1);
        myMap.put("E", 2);
        myMap.put("L", 3);

        String key = "M";
        if (myMap.containsKey(key)) {
            System.out.println("Key exists and the Value is " + myMap.get(key));
        } else {
            System.out.println("Key does not exist.");
        }
    }
}
