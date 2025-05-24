public class Pattern9 {
    public static void main(String[] args) {
        pat09(4);
        
    }


    // for 0 to n ------------------
    static void pat9(int n){
        int N = 2*n;
        for(int row = 0; row<=N; row++){
            for(int col = 0; col<=N; col++){
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(N-row, N-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    // for n to 0 ------------------
    static void pat09(int n){
        int N = 2*n;
        for(int row = 0; row<=N; row++){
            for(int col = 0; col<=N; col++){
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(N-row, N-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
