package binarySearchProblem;

public class CeilingNumber {

    static int celingNumber(int [] arr,int target){
        int st=0;
        int end=arr.length-1;
        
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]<target) {
                st=mid+1;
            }else{
                end=mid-1;
            }

        }
        
        
        return (st<arr.length)?arr[st]:-1;
    }

    public static void main(String[] args) {
            int [] arr={1,2,6,8,9,11,22,66,555,55555};
        System.out.println(celingNumber(arr,0));;
    }


}
