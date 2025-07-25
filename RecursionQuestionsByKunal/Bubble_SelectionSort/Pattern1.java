public class Pattern1 {
  
    public static void main(String[] args) {
        print(4, 0);
        print1(4, 0);
    }
    

    //downward triangle-------------
    static void print(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            System.out.print("*");
            print(r, c+1);
        }
        else{
            System.out.println();
            print(r-1, 0);
        }
    }


    // upwoard triangle--------------
    static void print1(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            print1(r, c + 1);
            System.out.print("*");
        }
        else{
            print1(r-1, 0);
            System.out.println();
        }
    }
}