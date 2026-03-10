package com.interview;

import com.array.ArrayMeth;

import java.util.Scanner;

//given array of n integer Program to print the resultant array with product od n-1 elements in an array
// input 5
//3 5 2 1 4
//output 40 24 60 120 30
public class D10FirstQuestion {

    public static void LogicforProduct(int[] arr,long product){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                System.out.print(product/arr[i]+" ");
            }else{
                System.out.print("0 ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayMeth.insertElements(arr);
        long product = ArrayMeth.productElements(arr);
        LogicforProduct(arr,product);
    }
}
