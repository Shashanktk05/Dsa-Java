package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    static boolean linearSearch(int [] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return true;
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
        if(linearSearch(arr,key)){
            System.out.println(key+" is present in ");
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println(key+" is not present in ");
            System.out.println(Arrays.toString(arr));
        }


    }

}
