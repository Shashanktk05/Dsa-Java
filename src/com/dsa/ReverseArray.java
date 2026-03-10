package com.dsa;

import com.array.ArrayMeth;

public class ReverseArray {
    public static void printReverseArray(int [] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        System.out.println("The reverse array is :");
        printReverseArray(arr);
    }
}
