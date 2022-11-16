package com.briodzlabz;

public class LargestNumber {
    static double max;
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5,2.4};
// Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
// Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total= total+myList[i];
        }
        System.out.println("Total is " + total);
// Finding the largest element
        System.out.println(myList[0]);
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
    }
}
