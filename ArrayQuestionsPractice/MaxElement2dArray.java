public class MaxElement2dArray {

    static int Max(int[][] array){
        int max = array[0][0];
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col]>max){
                    max = array[row][col];
                }
            }
        }
       return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,55,6},
            {7,8,9}
        };

        System.out.println(Max(arr));
    }
}
