package com.interview;

import com.array.ArrayMeth;

// to print maxSum and minSum value of an array which excluding 1 element
// input 1 5 2 6 3
//output maxSum of N-1 ele: 16 minSum of N-1 ele:  11
public class D09LastQuestion {
    public static void main(String[] args) {
        int[] arr = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        int sum = ArrayMeth.sumElements(arr);
        int maxE = ArrayMeth.largestElement(arr);
        int minE = ArrayMeth.smallestElement(arr);
        System.out.println("MaxSum of N-1 ele: " + (sum-minE) + " MinSum of N-1 ele : "+ (sum-maxE));

    }
}
