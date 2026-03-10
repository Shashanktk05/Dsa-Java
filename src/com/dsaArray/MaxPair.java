package com.dsaArray;

import com.array.ArrayMeth;

public class MaxPair {
    public static void printMaxPairs(int [] arr){
        int LargePlusSecondLargest = ArrayMeth.LargePlusSecondLargest(arr);
        System.out.println("The Max Pair is : ");
        System.out.println(LargePlusSecondLargest);
    }
    public static void main(String[] args) {
        int[] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printMaxPairs(arr);
    }
}
