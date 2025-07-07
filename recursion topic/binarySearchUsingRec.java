public class binarySearchUsingRec {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,66,77,88};
        int s = 0;
        int e = arr.length-1;
        int target = 66;

        int ans = search(arr, target, s, e);

        System.out.println(ans);
    }

    static int search(int[] arr, int target,  int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(arr[m]<target){
          return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);

    }
}
