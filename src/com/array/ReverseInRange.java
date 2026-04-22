package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInRange {

    static void reverseInRange(int[] arr,int st,int end){
        while(st<end){
            int t = arr[st];
            arr[st]=arr[end];
            arr[end]=t;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start index");
        int st = sc.nextInt();
        System.out.println("Enter end index");
        int end = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        reverseInRange(arr,st,end);
        System.out.println(Arrays.toString(arr));

    }
}
