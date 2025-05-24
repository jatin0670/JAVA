public class Pattern8 {
    public static void main(String[] args) {
        pat8(5);
    }

    static void pat8(int n){
        for(int row = 1; row<=2*n; row++){
            int totalcol = row>n ? 2*n-row : row;
            int totalsp = n-totalcol;
            for(int i = 1; i<=totalsp; i++){
                System.out.print("  ");
            }

            for(int col=totalcol; col>=1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col<=totalcol; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
