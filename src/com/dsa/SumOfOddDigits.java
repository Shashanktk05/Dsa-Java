package com.dsa;

import com.digits.DigitFun;

import java.util.Scanner;

public class SumOfOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int res= DigitFun.sumOfOddDigits(n);
        System.out.println("The sum of odd digits is :"+ res);
    }
}
