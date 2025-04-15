public class SearchInfinteArray {

    // -binary search in chunk of array 
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                 start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // find chunck of array
    static int ans(int[] arr, int target){
        int start = 0; 
        int end = 1;

        while(target>arr[end]){
            int temp = end +1;
            end = end + (end - start + 1)*2;
            start = temp;

        }
        return binarySearch(arr, target, start, end);
    }
    public static void main(String[] args) {
        int[] array = {1,4,6,12,44,78,123,765};
       int fans =  ans(array, 78);
       System.out.println(fans);
    }
}
