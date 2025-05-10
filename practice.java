import java.util.*;

class practice{

      static void Cycle(int[] a){
        int i=0;
        while(i<a.length){
          int cur = a[i]-1;
          if(a[i]!=a[cur]){
            swap(a, i, cur);
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

      public static void main(String args[]){
     
        int[] a = {5,4,3,2,1};
        Cycle(a);
        System.out.println(Arrays.toString(a));
    }
}