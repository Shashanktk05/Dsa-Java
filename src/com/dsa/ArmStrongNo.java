package com.dsa;

import com.digits.DigitMeth;

import java.util.Scanner;

public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        if(DigitMeth.isArmStrong(n)){
            System.out.println("Yes it is ArmStrong Number");
        }else {
            System.out.println("No it is ArmStrong Number");
        }
    }
}
