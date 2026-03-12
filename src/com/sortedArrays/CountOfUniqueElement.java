package com.sortedArrays;

import com.array.ArrayMeth;
//Enter the Size of the array :
//8
//Enter the elements of array:
//        2 2 2 3 4 4 4 23
//The elements in array are :
//        2 2 2 3 4 4 4 23
//Unique Element Count : 2

public class CountOfUniqueElement {
    public static void countOfUniqueEle(int[] arr){
        int count=1;
        int uniqueCount=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                count++;
            }else{
                if (count==1){
                    uniqueCount++;
                }
                count=1;
            }
        }if (count==1){
            uniqueCount++;
        }
        System.out.println("Unique Element Count : "+uniqueCount);
    }

    public static void main(String[] args) {
        int []arr= ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        countOfUniqueEle(arr);

    }
}
