public class CeilingOfANumber {

    static int Ceiling(int[] array, int target){
        int start = 0;
        int end = array.length-1;
 
        while(start<=end){
         int mid = start+(end-start)/2;
         if(target==array[mid]){
             return mid;
         }
         if(target>array[mid]){
             start = mid+1;
         }
         else{
             end = mid-1;
         }
         
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,12,34,45,67,89,99};
        int ans =  Ceiling(arr, 35);
        System.out.println(ans);
    }
}
