import java.util.*;

public class array_2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter row number: ");
       int row = sc.nextInt();                        // rows input

       System.out.print("Enter columns number: ");
       int col = sc.nextInt();                       // columns input

       int[][] array = new int[row][col];

       for(int i=0; i<row; i++){                    //input 
        for(int j=0; j<col; j++){
            array[i][j] = sc.nextInt();
        }
       }

       for(int i=0; i<row; i++){                     //output 
        for(int j=0; j<col; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
       }

       sc.close();
    }
}
