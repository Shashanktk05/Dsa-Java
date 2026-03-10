package com.dsa;

import com.digits.DigitMeth;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int n = sc.nextInt();
        if(DigitMeth.checkPrime(n)){
            System.out.println("The number is prime");
        }else {
            System.out.println("Not a prime number ");
        }
    }
}
