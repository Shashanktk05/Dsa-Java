package binarySearchProblem;

public class FloorNumber {

    static int floor(int [] arr,int target){
        int st=0;
        int end=arr.length-1;

        while (st<=end){
            int mid = st+(end-st)/2;

            if(arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]<target) {
                st=mid+1;
            }else{
                end=mid-1;
            }
        }

     return (end>=0)?arr[end]:-1;
    }

    public static void main(String[] args) {
        int [] arr={1,2,6,8,9,11,22,66,555,55555};
        System.out.println(floor(arr,5555));;
    }
}
