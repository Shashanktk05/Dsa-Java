package com.dsa;

import com.digits.DigitFun;

import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        if(DigitFun.isArmStrong(n)){
            System.out.println("Yes it is ArmStrong Number");
        }else {
            System.out.println("No it is ArmStrong Number");
        }
    }
}
