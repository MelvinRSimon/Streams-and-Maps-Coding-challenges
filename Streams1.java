//Write a program to create a list of integers. Use a stream to filter out the even numbers and calculate their sum.
//Example Input: [1, 2, 3, 4, 5, 6]
//Output: 12

import java.util.*;

public class Streams1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(102);
        myList.add(303);
        myList.add(304);
        myList.add(5);
        myList.add(3);
        myList.add(30);

        //using streams
        int sum = myList.stream().filter(i -> i%2 == 0).mapToInt(i -> i).sum();
        System.out.println("The sum is " + sum);

        //using for loop
        int forSum = 0;
        for(int i: myList) {
            if(i%2 == 0) {
                forSum += i;
            }
        }
        System.out.println("The sum is " + forSum);
    }
}