public class FloorOfANumber {

    static int Floor(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,12,34,45,67,89,99};
        int ans = Floor(arr, 35);
        System.out.println(ans);
    }
}
