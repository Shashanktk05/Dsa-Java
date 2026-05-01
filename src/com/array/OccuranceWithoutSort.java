package com.array;

public class OccuranceWithoutSort {
    static void printOccuranceWithoutSort(int[] arr){
        int count =0;
        boolean [] a = new boolean[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(!(a[j]) && arr[i]==arr[j] ) {
                    count++;
                    a[j] = true;
                }
            }
            if(count>0){
            System.out.println(arr[i]+" -----> "+ (count) );
            }
            count=0;
        }
    }
    static void printOccuranceWithoutSort2(int[] arr){
        int count =1;
        boolean [] a = new boolean[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!(a[j]) && arr[i]==arr[j] ) {
                    count++;
                    a[j] = true;
                }
            }
            if(!(a[i])) {
                System.out.println(arr[i] + " -----> " + (count));
                count=1;
            }
        }
        if(!(a[arr.length-1]))
            System.out.println(arr[arr.length-1]+" -----> "+ (count) );
    }
    public static void main(String[] args) {
        int [] arr=ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        ArrayMeth.printElements(arr);
        printOccuranceWithoutSort2(arr);
    }
}
