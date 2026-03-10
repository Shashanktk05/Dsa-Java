package com.digits;


public class DigitMeth {

    public static boolean isArmStrong(int n){
        int actual=n;
        int sum = 0;
        int count = DigitMeth.countDigits(n);
        while (n!=0){
            int res = n %10;
            sum = sum+(int)(Math.pow(res,count));
            n/=10;
        }
        return sum == actual;
    }

    public static int sumOfOddDigits(int n){
        int sum=0;
        while(n!=0){
            int res = n%10;
            if(res%2!=0){
                sum+=res;
            }
            n/=10;
        }
        return sum;
    }
    public static boolean checkPrime(int a){
        if (a<2) {
            return false;
        }
        for (int i = 2; i*i <= a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void sequencePrime(int num1,int num2){
        for (int i = num1; i < num2+1 ; i++) {
            if (checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static int  countDigits(int n){
        int  count =0;
        while (n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
