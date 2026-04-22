package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int[] arr){
        int i =0;
        int j = arr.length-1;
        while (i<j){
            int t = arr[i];
            arr[i++]=arr[j];
            arr[j--]=t;
        }
    }
    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
