package com.sortedArrays;

import com.array.ArrayMeth;

//Enter the Size of the array :
//        8
//Enter the elements of array:
//        2 2 2 3 4 4 4 23
//The elements in array are :
//        2 2 2 3 4 4 4 23
//The Elements in array are :
//        2
//        3
//        4
//        23
public class PrintWithoutRepeating {
    static void printAllElements(int [] arr){
        System.out.println("The Elements in array are : ");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
                System.out.println(arr[i]);
            }
        }System.out.println(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        int [] arr= ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printAllElements(arr);
    }
}
