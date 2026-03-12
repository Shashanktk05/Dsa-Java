package com.arrayPairs;

import com.array.ArrayMeth;

public class ArrayPairs {
    public static void printArrayPairs(int[] arr){
        System.out.println("Array pairs are");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        int []  arr= ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printArrayPairs(arr);
    }
}
