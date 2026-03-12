package com.sortedArrays;

import com.array.ArrayMeth;
//Enter the Size of the array :
//        8
//Enter the elements of array:
//        2 2 2 3 4 4 4 23
//The elements in array are :
//        2 2 2 3 4 4 4 23
//Occurence of each element :
//        2-3
//        3-1
//        4-3
//        23-1

public class OccurenceOfElement {
   static void printOccurence(int [] arr){
        int count = 1;
       System.out.println("Occurence of each element :");
       for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]==arr[i+1]){
               count++;
           }else{
               System.out.println(arr[i]+"-"+count);
               count = 1;
           }
       }
       System.out.println(arr[arr.length-1]+"-"+count);
    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printOccurence(arr);
    }
}
