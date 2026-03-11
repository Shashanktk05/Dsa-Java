package com.dsa;

import com.digits.DigitMeth;

import java.util.Scanner;

public class StrongNo {

//    public static int factorial(int n){
//        int fact =1;
//        for (int i = 1; i <=n; i++) {
//            fact*=i;
//        }
//        return fact;
//    }
//    public static boolean isStrong(int n){
//        int org = n;
//        int strong = 0;
//        while(n!=0){
//            int rem = n%10;
//            int fact = factorial(rem);
//            strong+=fact;
//            n/=10;
//        }
//        return org == strong;
//    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(DigitMeth.isStrong(n)){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}
