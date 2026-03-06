package com.dsa;

import com.array.ArrayFun;
import com.digits.DigitFun;

import java.util.Scanner;

public class PrintPrimeFromArray {
    static void printPrime(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (DigitFun.checkPrime(arr[i])){
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
        System.out.println("The prime number from array are :");
        printPrime(arr);
    }
}
