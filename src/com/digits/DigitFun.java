package com.digits;

public class DigitFun {

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
    public static void main(String[] args) {
        System.out.println();
    }
}
