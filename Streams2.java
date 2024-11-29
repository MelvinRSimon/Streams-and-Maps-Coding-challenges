//Write a program to convert a list of strings to uppercase using streams.
//Example Input: ["java", "streams", "tutorial"]
//Output: ["JAVA", "STREAMS", "TUTORIAL"]

import java.util.*;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("melvin");
        myList.add("simon");
        myList.add("timothy");
        myList.add("kevin");
        myList.add("joshua");
        myList.add("felix");

        //using streams
        List<String> updatedMyList = myList.stream().map(i -> i.toUpperCase()).toList();
        System.out.println(updatedMyList.toString());

        //using for loop
        ArrayList<String> forList = new ArrayList<>();
        for(String i: myList) {
            forList.add(i.toUpperCase());
        }
        System.out.println(forList.toString());
    }
}
