import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
         int[] array = {5,4,3,2,1};
         BubbleS(array);

        System.out.println(Arrays.toString(array));
    }    

    static void BubbleS(int[] arr){
        boolean swapped; // if arr is sorted we dont need to run sorting algo
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<=arr.length-i-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
