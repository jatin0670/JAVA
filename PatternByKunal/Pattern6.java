public class Pattern6 {
    public static void main(String[] args) {
        pat6(5);
    }

    static void pat6(int n){
        for(int row = 0; row<2*n; row++){
            int totalcol = row>n ? 2*n-row : row;
            int totalsp = n-totalcol;

            for(int i=0; i<totalsp; i++){
                System.out.print(" ");
            }

            for(int col = 0; col<totalcol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
