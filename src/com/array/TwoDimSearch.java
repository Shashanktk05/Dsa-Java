package com.array;

import java.util.Arrays;

public class TwoDimSearch {

    static int [] search(int[][]arr,int  target){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
//                    System.out.print(arr[i][j]+" ");
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
//                System.out.println();
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] arr ={
                {1,2,6,5,4,78},
                {55,3,66,26},
                {22,36,554},
                {91,72,63}
        };
        int [] a=search(arr,63);
        System.out.println(Arrays.toString(a));

    }
}
