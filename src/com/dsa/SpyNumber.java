package com.dsa;

import java.util.Scanner;

public class SpyNumber {
    static boolean isSpy(int n){
        int sum =0;
        int prod=1;
        while(n!=0){
            sum += n%10;
            prod *=n%10;
            n/=10;
        }
        return sum==prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to Check Spy Number");
        int n = sc.nextInt();
        System.out.println((isSpy(n)? n+" is Spy":n+ " Not a Spy"));
    }
}
