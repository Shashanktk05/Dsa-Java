package com.sortedArrays;

import com.array.ArrayMeth;
//Enter the Size of the array :
//        10
//Enter the elements of array:
//        2 3 3 3 4 5 7 7 9 11
//The elements in array are :
//        2 3 3 3 4 5 7 7 9 11
//The Largest Element is : 7

public class LargestElementOfOccurence {
    public static void largestOccurenceEle(int[] arr){
        int count =1;
        int largeEle=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                count++;
            }else{
                if (count>1){
                    largeEle=arr[i];
                }count=1;
            }
        }if (count>1){
            largeEle=arr[arr.length-1];
        }
        System.out.println("The Largest Element is : "+ largeEle);
    }

    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        largestOccurenceEle(arr);
    }
}
