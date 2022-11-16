package com.briodzlabz;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int [] array=new int[size];
        for (int i=0;i<array.length;i++)
        {
         array[i]= scanner.nextInt();
         System.out.println(array[i]);
        }
    }
}
