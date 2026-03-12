package com.arrayPairs;

import com.array.ArrayMeth;

public class MergeArray {
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        int [] arr2 = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.insertElements(arr2);
        ArrayMeth.printElements(arr);
        ArrayMeth.printElements(arr2);
//        ArrayMeth.mergeArray(arr,arr2);
    }
}
