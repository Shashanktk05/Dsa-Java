package com.array;

import java.util.Scanner;

public class ArrayMeth {
//
//    public static int[] mergeArray(int [] arr,int[] arr2){
//
//    }
public static void pairsEqualsToK(int[] arr , int k){
    System.out.println("The Pairs are :");
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]+arr[j]==k){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
    public static int secondSmallestPlusElement(int [] arr){
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(smallest > arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest>arr[i]) {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest+smallest;
    }

    public static int secondSmallestElement(int [] arr){
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(smallest > arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest>arr[i]) {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static int  LargePlusSecondLargest(int[] arr){
        int large = arr[0];
        int secondLarge = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(large < arr[i]){
                secondLarge=large;
                large = arr[i];
            } else if (secondLarge<arr[i]) {
                secondLarge= arr[i];
            }
        }return large+secondLarge;
    }
    public static int secondLargestElement(int[] arr){
        int large = arr[0];
        int secondlarge=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(large < arr[i]){
                secondlarge=large;
                large = arr[i];
            }else if (secondlarge<arr[i]){
                secondlarge=arr[i];
            }
        }
        return secondlarge;
    }
    public static int largestElement(int[] arr){
       int large=arr[0];
        for(int i = 0; i < arr.length; i++) {
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
            if(arr[i]!=0){
                product*=arr[i];
            }
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
