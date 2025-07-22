public class Pallindrome {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(pal(n));
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

    static boolean pal(int n){
        rev(n);
        return  n == ans;
    }

    
}
