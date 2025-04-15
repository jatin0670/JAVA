public class fiboSeries {
    public static void main(String args[]){

        int first = 0; 
        int second = 1;

        System.out.print(first + " ");   /// for extra touch

        for(int i=0; i<10; i++){
            int n = first + second;
            first = second;
            second = n;

            System.out.print(n + " ");
        }
    }
}
