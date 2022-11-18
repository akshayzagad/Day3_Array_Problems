package com.briodzlabz;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int size = scanner.nextInt();
        int[] Array = new int[size];
        System.out.println(Array.length);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the  element");
            Array[i] = scanner.nextInt();
        }
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);
        System.out.println("Enter the location");
        int loc = scanner.nextInt();


        for (int i = loc; i < loc-1; i++) {
            Array[i] = Array[i + 1];
        }
        size--;
        for (int i=0;i<size;i++) {
            System.out.println(Array[i]);
        }
    }
}
