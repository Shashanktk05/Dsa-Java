package com.sortedArrays;
import com.array.ArrayMeth;


public class RepeatedEleBothArrays {
   static void repeatedEle(int [] arr ,int [] arr2){
       int i =0;
       int j =0;
//       int[] res = new int[arr.length+arr2.length];
       System.out.println("The repeated Elemets are :");
       while(i<arr.length && j<arr2.length){
           if(arr[i]==arr2[j]){
               System.out.print(arr[i]+" ");
               i++;j++;
           } else if (arr[i]>arr2[j]) {
               j++;
           }else{
               i++;
           }
       }
   }
    static void repeatedEleDesc(int [] arr ,int [] arr2){
        int i =arr.length-1;
        int j =arr2.length-1;
//       int[] res = new int[arr.length+arr2.length];
        System.out.println("\nThe repeated Elemets are :");
        while(i>=0 && j>=0){
            if(arr[i]==arr2[j]){
                System.out.print(arr[i]+" ");
                i--;j--;
            } else if (arr[i]<arr2[j]) {
                j--;
            }else{
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr =ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr);
        int [] arr2 = ArrayMeth.create1DArray();
        ArrayMeth.insertElements(arr2);
        ArrayMeth.printElements(arr);
        ArrayMeth.printElements(arr2);
        repeatedEle(arr,arr2);
        repeatedEleDesc(arr,arr2);
    }

}
