public class Pattern1 {
    
public static void main(String[] args) {
     p1(5);
    
}
 
static void p1(int n ){
    for(int row = 1; row<=n; row++){
        for(int col = 1; col<=row; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }

}
