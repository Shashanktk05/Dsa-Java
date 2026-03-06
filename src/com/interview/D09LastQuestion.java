package com.interview;

import com.array.ArrayFun;

// to print maxSum and minSum value of an array which excluding 1 element
// input 1 5 2 6 3
//output maxSum of N-1 ele: 16 minSum of N-1 ele:  11
public class D09LastQuestion {
    public static void main(String[] args) {
        int[] arr = ArrayFun.create1DArray();
        ArrayFun.insertElements(arr);
        ArrayFun.printElements(arr);
        int sum = ArrayFun.sumElements(arr);
        int maxE = ArrayFun.largestElement(arr);
        int minE = ArrayFun.smallestElement(arr);
        System.out.println("MaxSum of N-1 ele: " + (sum-minE) + " MinSum of N-1 ele : "+ (sum-maxE));

    }
}
