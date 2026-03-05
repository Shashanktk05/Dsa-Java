package com.dsa;

import com.digits.DigitFun;

import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count =DigitFun.countDigits(n);
        System.out.println("Count : "+count);
    }
}
