package com.Patterns;

import java.util.Scanner;
public class Triangle {
    static void printTriangle(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i>j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Size :");
        int n = sc.nextInt();

        printTriangle(n);

    }
}
