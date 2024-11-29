//Write a program to sort a map by its keys.
//Example Input: {3="Three", 1="One", 2="Two"}
//Output: {1="One", 2="Two", 3="Three"}

import java.util.*;

public class Map3 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(5, "Five");
        myMap.put(3, "Three");
        myMap.put(1, "One");
        myMap.put(4, "Four");
        myMap.put(2, "Two");

        Map<Integer, String> sortedMap = new TreeMap<>(myMap);
        System.out.println("Sorted map: " + sortedMap);
    }
}
