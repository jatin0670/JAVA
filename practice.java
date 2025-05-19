import java.util.*;

class practice{

      public static void main(String args[]){
     
      int arr[] = {4,1,2,5,3};
      cycl(arr);
      System.out.println(Arrays.toString(arr));

    }

    static void cycl(int[] ar){
      int i=0;
      while(i<ar.length){
           int index = ar[i]-1;
           if(ar[i]!=ar[index]){
            swap(ar, i, index);
           }
           else{
            i++;
           }
          
      }
    }

    static void swap(int[] a, int f, int l){
      int temp = a[f];
      a[f] = a[l];
      a[l] = temp;
    }
}