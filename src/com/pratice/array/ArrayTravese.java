package com.pratice.array;

import java.util.Scanner;

public class ArrayTravese {

    public static void insertElements(int [] arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
    }
    public static void printElements(int [] arr){
        System.out.println("The elements in array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        insertElements(arr);
        printElements(arr);
    }
}
