import java.util.*;

// this matrix or 2d array is sorted - row wise and column wise but its not strictly sorted

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        int[] ans = search(array, 37);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[] {row,col};
            }
            else if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
