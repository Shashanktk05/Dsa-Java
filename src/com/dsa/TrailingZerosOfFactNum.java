package com.dsa;

import java.util.Scanner;

public class TrailingZerosOfFactNum {
    public static int trailingZero(int n){
        int res = 0;
        int powOf5 = 5;
        while(n>=powOf5){
            res = res + n/powOf5;
            powOf5=5*powOf5;
        }return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int res=trailingZero(n);
        System.out.println(res);
    }
}
