package com.mergeArrays;

import com.array.ArrayMeth;

public class ThreeArrayMerge {
    static void merge(int [] arr1,int[] arr2,int[] arr3){
        System.out.println("Merged Array");
        int l=arr1.length+arr2.length+arr3.length;
        int k = 0;
        int i=0;
        int[] res=new int[l];
        while(k<l){
            if(i<arr1.length){
                res[k]=arr1[i];
                k++;
            }
            if(i<arr2.length){
                res[k++]=arr2[i];
            }
            if(i<arr3.length){
                res[k++]=arr3[i];
            }
            i++;
        }
    for(int j =0;j<res.length;j++){
        System.out.print(res[j]+" ");
    }
    }

    public static void main(String[] args) {
        int [] arr1=ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr1);

        int [] arr2=ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr2);

        int [] arr3=ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr3);
        ArrayMeth.printElements(arr1);
        ArrayMeth.printElements(arr2);
        ArrayMeth.printElements(arr3);

        merge(arr1,arr2,arr3);
    }
}
