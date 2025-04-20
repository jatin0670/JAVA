import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] ar){
        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(ar[j]<ar[j-1]){
                    Swap(ar, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void Swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}
