public class Pattern5 {
    public static void main(String[] args) {
        pat5(5);
    }


    //kunal's approch----------------------
    static void pat5(int n){
        for(int row = 0; row<2*n; row++){
            int totalColInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col<totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    //---------------------------------------------
    // static void pat5(int n){
    //     for(int row=1; row<=n; row++){
    //         for(int col = 1; col<=row; col++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
        
    //     for(int row1 = 1; row1<=n-1; row1++){
    //        for(int col1 = 1; col1<=(n-1)-row1+1; col1++){
    //         System.out.print("* ");
    //        }
    //        System.out.println();
    //     }
    // }
}
