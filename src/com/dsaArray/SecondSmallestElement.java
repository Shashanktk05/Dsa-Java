package com.dsaArray;

import com.array.ArrayMeth;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        int secondLargest = ArrayMeth.secondSmallestElement(arr);
        System.out.println(secondLargest);
    }
}
