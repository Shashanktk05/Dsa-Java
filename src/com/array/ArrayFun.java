package com.array;

import java.util.Scanner;

public class ArrayFun {
    public static int largestElement(int[] arr){
       int large=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }
    public static int smallestElement(int[] arr){
        int small=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;
    }
    public static long productElements(int [] arr){
        if(arr.length==0)return 0;
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product*=arr[i];
        }
        return product;
    }
    public static int [] create1DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array :");
        int n = sc.nextInt();
        int[] arr = new int [n];
        return arr;
    }

    public static void insertElements(int [] arr){
        if(arr.length==0)return ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
    }
    public static void printElements(int [] arr){
        if(arr.length==0)return;

        System.out.println("The elements in array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
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
        int [] arr = new int [n];
        insertElements(arr);
        printElements(arr);
    }
}
