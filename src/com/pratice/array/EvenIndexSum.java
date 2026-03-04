package com.pratice.array;

import java.util.Scanner;

public class EvenIndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayTravese.insertElements(arr);
        ArrayTravese.printElements(arr);
        int res = ArraySum.sumOfEvenElements(arr);
        System.out.println("Sum of Even Index is : "+res);
    }
}
