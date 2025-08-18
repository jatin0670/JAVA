public class LamdaFunc {
    public static void main(String[] args) {
        operation sum = (a,b) -> a+b; 
        operation prod = (a,b) -> a*b;
        operation sub = (a,b) -> a-b;

        // System.out.println(operate(4,5, sum));
    }

    private int operate(int a, int b, operation op){
        return op.operation(a, b);
    }

    public interface operation {
    
        int operation(int a, int b);
    }
}


// not completed 