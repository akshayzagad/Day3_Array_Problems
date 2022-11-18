package com.briodzlabz;

import java.util.Scanner;

public class SortingArrayDsending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Lenght");
        int Lenght = scanner.nextInt();
        int[] Array = new int[Lenght];
        System.out.println("Enter the Array Element");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
        }
        for (int i = 0; i < Lenght; i++) {
            for (int j = i + 1; j < Lenght; j++) {
                if (Array[i] < Array[j]) {
                    int Temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = Temp;
                }
            }
            System.out.println(Array[i]);
        }
    }
}
