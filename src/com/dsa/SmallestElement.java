package com.dsa;

import com.array.ArrayFun;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = ArrayFun.create1DArray();
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
       int small = ArrayFun.smallestElement(arr);
        System.out.println("The Smallest Element is : "+small);
    }
}
