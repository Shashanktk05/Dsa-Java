package com.dsa;

import com.array.ArrayMeth;

public class ArrayProduct {
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        long res = ArrayMeth.productElements(arr);
        System.out.println("Product is : "+res);
    }
}
