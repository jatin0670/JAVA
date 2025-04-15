// import java.util.*;

public class function {
    // normal void function ------
    // public static void myName(String name){
    //     System.out.print("hello " + name);
    //     return;
    // }

    
    //function for add two numbers------------------
    // public static int Sum(int val1, int val2){
    //     int c = val1+val2;
    //     return c;
    // }

    // to find factorial of a number 
    public static int fac(int a){
       
        int mul =1 ;
        for(int i=a; i>=1; i--){
        mul*=i;

        }
        return mul;
    }

    public static void main(String args[]){
        //first method to call a fucntion-----------------------
    //   myName("jatin");


    //second method to call a function-----------------
    // System.out.print("Enter Your Name: "); 
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // sc.close();
    // myName(name);


    //add function------
    // int a,b;
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter first numbers: ");
    // a = sc.nextInt();
    // System.out.print("Enter second numbers: ");
    // b = sc.nextInt();
    // sc.close();

    // int ans = Sum(a,b);
    // System.out.print("Your sum is: " + ans);

    System.out.print(fac(-3));

    }
}
