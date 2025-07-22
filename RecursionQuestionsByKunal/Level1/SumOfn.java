public class SumOfn {
    public static void main(String[] args) {
        int ans = sum(2);
        System.out.println(ans);
    }

    // for only +ve numbers
    static int sum(int n){
        if (n==1){
            return 1;
        }
        if(n<=0){
            return -1;
        }

        return n + sum(n-1);
    }
}
