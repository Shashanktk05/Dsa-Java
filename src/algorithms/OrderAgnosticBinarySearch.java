package algorithms;

public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int [] arr ,int target){

        int st=0;
        int end= arr.length-1;

        boolean isAsc = arr[st]<arr[end];

        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                 if (arr[mid]<target) {
                    st=mid+1;
                } else  {
                    end=mid-1;
                }
            }else{
                 if (arr[mid]>target) {
                    st=mid+1;
                } else  {
                    end=mid-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int [] arr ={88,66,64,26,22,6,5,3,2,1};
        System.out.println(orderAgnosticBinarySearch(arr,6));

    }
}
