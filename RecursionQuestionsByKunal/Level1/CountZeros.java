public class CountZeros {
    public static void main(String[] args) {
        int n = 34204304;
        int c = 0;
        System.out.println(count(n,c));
        
    }

    static int count(int n, int c){
        if(n==0){
            return c;
        } 

        int rem = n%10;

        if(rem == 0){
            return count(n/10, c+1);
        }
        else{
            return count(n/10, c);
        }

    }
}
