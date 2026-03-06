package com.dsa;

import com.array.ArrayFun;

public class LargestElement {

    public static void main(String[] args) {
        int [] arr = ArrayFun.create1DArray();
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
        int res=ArrayFun.largestElement(arr);
        System.out.println("The Largest Element is : "+ res);

    }
}
