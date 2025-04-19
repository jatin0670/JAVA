import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        Selection(a);
        System.out.println(Arrays.toString(a));

    }

    static void Selection(int[] arr){
       for(int i=0; i<arr.length; i++){
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);

       }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int f, int l){
        int temp;
        temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}
