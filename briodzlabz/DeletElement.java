package com.briodzlabz;

import java.util.Scanner;

public class DeletElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of element");
        int size= scanner.nextInt();
        int []Array=new int[size];
        for (int i=0;i<size;i++) {
            System.out.println("Enter the  element");
            Array[i] = scanner.nextInt();
//            System.out.println(Array[i] + " ");
        }
        System.out.println("Enter the location");
        int loc=scanner.nextInt();
        for (int i=loc;i<loc-1;i++){
            Array[i]=Array[i+1];
        }
        size--;
        for (int i=0;i<size;i++) {
            Array[i] = scanner.nextInt();
            System.out.println(Array[i] + " ");
        }
    }
}
