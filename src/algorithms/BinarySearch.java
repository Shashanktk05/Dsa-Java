package algorithms;

import java.util.Arrays;

public class BinarySearch {

    static int find(int[]arr ,int target){
        int st=0;
        int end=arr.length-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                st=mid+1;
            } else  {
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 5, 6, 22, 26, 64, 66, 88};


        System.out.println(find(arr,6));

    }

}
