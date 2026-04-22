package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    static int [] leftRotation(int [] arr){
        int t=arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=t;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        System.out.println(Arrays.toString(arr));
        int [] res=leftRotation(arr);
        System.out.println(Arrays.toString(res));

    }
}
