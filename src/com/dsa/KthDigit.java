package com.dsa;

import java.util.Scanner;

public class KthDigit {
    static int kthDigit(int n ,int k){
        int num=-1;
        int count =0;
        while(n!=0){
            count++;
            int rem = n%10;
            if(k==count){
                num=rem;
            }
            n/=10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to Number");
        int n = sc.nextInt();
        System.out.println("Enter to K value");
        int k = sc.nextInt();
        System.out.println(kthDigit(n,k));
    }
}
