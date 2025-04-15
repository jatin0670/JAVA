import java.util.*;

class practice{

    static int[] search(int[][]ar, int target){
        int row = 0;
        int col = ar.length-1;

        while(row<ar.length && col>=0){
              if(ar[row][col]==target){
                return new int[] {row,col};
              }
              else if(ar[row][col]<target){
                row++;
              }
              else{
                col--;
              }

        }
        return new int[] {-1,-1};
    }

      public static void main(String args[]){
      int[][] arr = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };

      int[] ans = search(arr, 9);
      System.out.println(Arrays.toString(ans));
      
    }
}