public class Search2DArray {

    static int[] search(int[][] array, int target){
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
         return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,4,5},
            {12,76,87},
            {65,33}
        };

        int x = 76;
        int[] ans = search(arr, x);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] +" ");
        }
        
    }
}
