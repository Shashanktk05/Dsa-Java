package com.dsa;

import com.array.ArrayFun;

import java.util.Scanner;

public class PrintOddElements {
    public static void printOddElements(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
        System.out.println("The odd elements are : ");
        printOddElements(arr);

    }
}
