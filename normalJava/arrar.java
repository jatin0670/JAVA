import java.util.*;

public class arrar {
    public static void main(String args[]){

        // first method of creating array 

        // int[] marks = new int[3];

        // int marks[] = new int[3];              we can also define like that
        // marks[0] = 78;
        // marks[1] = 87;
        // marks[2] = 98;
        // or direclty
        // int[] marks = {78,87,98};

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // we can also print the value of array with the help of loops
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

 
        // second method of creating array  LIKE cpp

        // int marks[] = {78, 87, 98};
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

        //----------------------------------------------

        int size;
        System.out.print("enter array size: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("enter values in array: ");
        //loop for input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //loop for output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }

        sc.close();
        
    }
}
