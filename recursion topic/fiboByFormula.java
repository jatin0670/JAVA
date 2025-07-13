public class fiboByFormula {
    public static void main(String[] args) {
        // for(int i=0; i<=10; i++){
        //  System.out.println(fibo(i));   
        // }

        System.out.println(fibo(50));
        
    }

    static long fibo(int n){
       return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2),n) - Math.pow(((1 - Math.sqrt(5)) / 2),n)) / Math.sqrt(5)); 
    }
}


// this is also give the same ans - return (int) (Math.pow(((1 + Math.sqrt(5)) / 2),n) / Math.sqrt(5));
// we removed the least dominating term
