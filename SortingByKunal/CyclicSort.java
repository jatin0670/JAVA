import java.util.*;

public class CyclicSort {

    public static void main(String[] args) {
        int arr[] = {4,5,2,1,3};
        Cyclic(arr);
         
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclic(int[] a){
       int i=0; 
       while(i<a.length){
           int current = a[i]-1;
           if(a[i]!=a[current]){
              Swap(a, i, current);
           }
           else{
            i++;
           }
       }
    }

    static void Swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}