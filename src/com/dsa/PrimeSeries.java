package com.dsa;

import com.digits.DigitFun;

import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no");
        int num2 = sc.nextInt();
        DigitFun.sequencePrime(num1,num2);
    }
}
