//Write a program to group integers into odd and even categories using streams.
//Example Input: [1, 2, 3, 4, 5]
//Output: {Odd=[1, 3, 5], Even=[2, 4]}

import java.util.*;
import java.util.stream.Collectors;

public class Streams4 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(102);
        myList.add(303);
        myList.add(304);
        myList.add(5);
        myList.add(3);
        myList.add(30);

        //using streams
        Map<String, List<Integer>> updateMap = myList.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        System.out.println("Grouped by Odd and Even: " + updateMap);
    }
}
