package com.dsaArray;

import com.array.ArrayMeth;

public class MinPair {
    public static void printMinPair(int [] arr){
            int smallestPlusSecondSmallest = ArrayMeth.secondSmallestPlusElement(arr);
        System.out.println("The Min pair is");
            System.out.println(smallestPlusSecondSmallest);
    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printMinPair(arr);
    }
}
