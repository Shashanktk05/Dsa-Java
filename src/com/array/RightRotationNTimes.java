package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotationNTimes {
    static int [] rightRotationNTimes(int [] arr,int k){
        k = k% arr.length;
        for (int i = 0; i < k; i++) {
             RightRotation.rightRotationArray(arr);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter No Of Rotation : ");
        int k = sc.nextInt();
        int [] res = rightRotationNTimes(arr,k);
        System.out.println(Arrays.toString(res));
    }
}
