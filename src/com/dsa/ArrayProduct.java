package com.dsa;

import com.array.ArrayFun;

public class ArrayProduct {
    public static void main(String[] args) {
        int [] arr =ArrayFun.create1DArray();
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
        long res = ArrayFun.productElements(arr);
        System.out.println("Product is : "+res);
    }
}
