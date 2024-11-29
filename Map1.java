//Write a program to count the frequency of each character in a string using a map.
//Example Input: "hello"
//Output: {h=1, e=1, l=2, o=1}

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> myMap = new HashMap<>();

        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        for (char c : arr) {
            if (myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c) + 1);
            } else {
                myMap.put(c, 1);
            }
        }

        System.out.println("Character frequency: " + myMap);
    }
}
