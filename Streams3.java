//Create a list of names and find all names starting with the letter 'A'.
//Example Input: ["Alice", "Bob", "Andrew", "Charlie"]
//Output: ["Alice", "Andrew"]

import java.util.*;

public class Streams3 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("melvin");
        myList.add("simon");
        myList.add("timothy");
        myList.add("kevin");
        myList.add("joshua");
        myList.add("felix");

        //using streams
        List<String> updatedMyList = myList.stream().filter(i -> i.startsWith("m")).toList();
        System.out.println(updatedMyList.toString());

        //using for loop
        ArrayList<String> forList = new ArrayList<>();
        for(String i: myList) {
            if(i.startsWith("m")) {
                forList.add(i);
            }
        }
        System.out.println(forList.toString());
    }
}
