package com.sortedArrays;

import com.array.ArrayMeth;

//Enter the Size of the array :
//        8
//Enter the elements of array:
//        2 2 2 3 4 4 4 23
//The elements in array are :
//        2 2 2 3 4 4 4 23
//The Unique Elements are :
//        3
//        23
public class PrintUniqueElement {
    public static void printUnique(int[] arr){
        int count = 1;
        System.out.println("The Unique Elements are : ");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                count++;
            }
            else {
                if (count==1){
                    System.out.println(arr[i]);
                }
                count=1;
            }
        }
        if (count==1){
        System.out.println(arr[arr.length-1]);
        }
    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printUnique(arr);
    }
}
