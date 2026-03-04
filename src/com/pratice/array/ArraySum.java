package com.pratice.array;

import java.util.Scanner;

public class ArraySum {

    public static int sumElements(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
              sum+=arr[i];
        }
        return sum;
    }
    public static int sumOfEvenElements(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length;i+=2) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        ArrayTravese.insertElements(arr);
//        ArrayTravese.printElements(arr);
        int res = sumElements(arr);
        System.out.println("Sum of elements is : "+ res);
    }
}
