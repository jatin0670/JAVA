import java.util.*;

public class ReverseArrayFunction {

    static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        reverse(arr);
    }
}
