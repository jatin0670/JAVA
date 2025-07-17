public class SqrOfNumber {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(sqr(n));
    }

    static int sqr(int n){
        int s = 0; int e = n;
        while(s<=e){
            int mid = s + (e - s)/2;

            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid > n){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }

        }

        return -1;
    }
}
