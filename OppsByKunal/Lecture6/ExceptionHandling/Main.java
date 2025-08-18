
public class Main {
    public static void main(String[] args) {
        int a = 4; 
        int b = 0;
        

        // try{
        //     divide(a, b);
        // }
        // catch(Exception e){
        //    System.out.println(e.getMessage());
        // }
        // finally{
        //     System.out.println("always executes whether exception occurs or not");
        // }

       try{
        String name = "jatin";
        if(name.equals("jatin")){
            throw new MyException("name exeption");
        }
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
        

        
    }
    
    // throw = to throw exception
    // throws = to declare exception
    static int divide(int a, int b) throws ArithmeticException{  
        if(b == 0){
            throw new ArithmeticException("cant divide by zero ");
        }
            return a/b;
        }
}
