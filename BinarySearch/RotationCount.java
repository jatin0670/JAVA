public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,2,3,4};
        int ans = FindPivot(arr); // to find roatational array
        System.out.println(ans);
    }

    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                return mid + 1;
            }
           if(arr[mid]<arr[mid-1]){
            return mid;
           }
           if(arr[start]>arr[mid]){
            end = mid - 1;
           }
           else{
            start = mid + 1;
           }
        }
        return -1;
    }
}
