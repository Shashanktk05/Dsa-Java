package com.sortedArrays;

import com.array.ArrayMeth;
//Enter the Size of the array :
//        10
//Enter the elements of array:
//        2 2 3 3 5 5 5 5 6 7
//The elements in array are :
//        2 2 3 3 5 5 5 5 6 7
//The Max Repeated Element is 5 for 4 times
public class maxOccurenceElement {
    public static void maxOccureneceEle(int[] arr){
        int count = 1;
        int max = 0;
        int maxElement=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                count++;
            }else{
                if(max<count){
                    max=count;
                    maxElement=arr[i];
                }count=1;
            }
        }if(max<count){
            max=count;
            maxElement=arr[arr.length-1];
        }
        System.out.println("The Max Repeated Element is " + maxElement +" for "+ max +" times");
    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        maxOccureneceEle(arr);
    }
}
