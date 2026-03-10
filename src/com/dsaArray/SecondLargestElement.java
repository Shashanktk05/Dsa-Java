package com.dsaArray;

import com.array.ArrayMeth;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        int secLargest = ArrayMeth.secondLargestElement(arr);
        System.out.print("The Second Largest Element is : ");
        System.out.print(secLargest);
    }
}
