package com.dsa;

import com.array.ArrayMeth;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
       int small = ArrayMeth.smallestElement(arr);
        System.out.println("The Smallest Element is : "+small);
    }
}
