package com.dsa;

import java.util.Scanner;

public class GcdOfNumber {
    public static int gcd(int n,int m){
        while(n != m){
            if(n > m){
                n = n - m;
            } else {
                m = m - n;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int n = sc.nextInt();
        System.out.println("Enter num 2");
        int m = sc.nextInt();
        int res = gcd(n,m);
        System.out.println("GCD: " + res);
    }
}