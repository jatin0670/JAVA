public class RevNumer01 {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(ans);
    }

    static int ans = 0;

    static void rev(int n){
      if(n==0){
        return;
      }

      int rem = n%10;
      ans = ans * 10 + rem;
      rev(n/10);
    
    }
}
