public class BinarySearch {

    static int Binarysearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
           // int mid = (start+end)/2  --- not the best way to find mid index
           int mid = start + (end-start)/2;

           if(target<array[mid]){
            end = mid-1;
           }
           else if(target>array[mid]){
            start = mid+1;
           }
           else{
            return mid;     //found
           }
        }
        return -1; //not found
    }
     public static void main(String[] args) {
        int[] arr = {1,6,7,9,11,23,65,78,89,96};
        
       int ans =  Binarysearch(arr, 65);
       System.out.println(ans);
     }    
}
