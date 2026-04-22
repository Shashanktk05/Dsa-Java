package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static boolean binarySearch(int[] arr,int key){
        int st = 0;
        int end = arr.length-1;
        while (st<=end){
            int mid = (st+end)/2;
            if(arr[mid]==key){
                return true;
            } else if (arr[mid]>key) {
                end=mid-1;
            } else  {
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        System.out.println("Enter the value to be checked");
        int key = sc.nextInt();
        if(binarySearch(arr,key)){
            System.out.println(key+" is present in ");
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println(key+" is not present in ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
