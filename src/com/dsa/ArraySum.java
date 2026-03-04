package com.dsa;

import com.array.ArrayFun;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
        int res= ArrayFun.sumElements(arr);
        System.out.println("The Sum of array is : "+res);
    }
}
