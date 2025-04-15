import java.util.*;

class FirstClass {
    public static void main(String args[]){
        // System.out.print("Enter your name: ");
        // Scanner sc = new Scanner(System.in);
        // //nextLine for string typed values 
        // String name = sc.nextLine();
        // System.out.println(name);
        // sc.close();
        // //nextInt for int typed values 
        // //nextFloat for flaot typed values and so on

        int a, b;
        // to get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first value: ");
        a = sc.nextInt();
        
        System.out.print("enter your second value:");
        b = sc.nextInt();
        sc.close();       //to close the scanner

        int c = a+b;
        System.out.println(c);
         
        
    }
}

