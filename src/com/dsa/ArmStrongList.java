package com.dsa;

import com.digits.DigitMeth;

import java.util.Scanner;

public class ArmStrongList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int num1= sc.nextInt();
        System.out.println("Enter the ending number");
        int num2= sc.nextInt();
        for(int i = num1 ; i<=num2;i++){
            if (DigitMeth.isArmStrong(i)){
                System.out.println(i);
            }
        }
    }

}
