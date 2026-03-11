package com.dsa;

import com.digits.DigitMeth;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = DigitMeth.factorial(n);
        System.out.println("Fact :" +fact);
    }
}
