package com.arrayPairs;

import com.array.ArrayMeth;

import java.util.Scanner;

public class D11PairsEqualToK {

//    public static void pairsEqualsToK(int[] arr , int k){
//        System.out.println("The Pairs are :");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]+arr[j]==k){
//                    System.out.println(arr[i]+" "+arr[j]);
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        Scanner sc = new Scanner(System.in);
        ArrayMeth.insertElements(arr);
        System.out.println("Enter K value :");
        int k = sc.nextInt();
        ArrayMeth.printElements(arr);
        ArrayMeth.pairsEqualsToK(arr,k);
    }
}
