package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {
    static int [] rightRotationArray(int [] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        System.out.println(Arrays.toString(arr));
        int [] res = rightRotationArray(arr);
        System.out.println(Arrays.toString(res));

    }
}
