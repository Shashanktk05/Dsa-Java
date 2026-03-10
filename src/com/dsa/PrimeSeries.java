package com.dsa;

import com.digits.DigitMeth;

import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no");
        int num2 = sc.nextInt();
        DigitMeth.sequencePrime(num1,num2);
    }
}
