package com.dsa;

import com.array.ArrayMeth;

public class LargestElement {

    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        int res= ArrayMeth.largestElement(arr);
        System.out.println("The Largest Element is : "+ res);

    }
}
