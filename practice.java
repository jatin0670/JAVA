import java.util.*;

class practice{

      static void BubS(int[] arr){
        for(int i=0; i<arr.length; i++){
          for(int j=1; j<=arr.length-i-1; j++){
            if(arr[j]<arr[j-1]){
              int temp = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = temp;
            }
          }
        }
      }

      public static void main(String args[]){
     
        int[] a = {5,4,3,2,1};
        BubS(a);
        System.out.println(Arrays.toString(a));
    }
}