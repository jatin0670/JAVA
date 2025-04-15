import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax -> Arraylist<Integer> variableName = new ArrayList<>(we can write the capacity here)
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(5);
        // List.add(23);
        // List.add(43);
        // List.add(43);   // we can add values like this
        // List.add(3);
        // List.add(90);


        // List.set(0, 44);  we can change the value of an index 

        // List.remove(3);  it can remove the value

        // System.out.println(List); // we can also print like this 


        //input 
       for(int i=0; i<5; i++){
            List.add(in.nextInt());
       }


       //output
        for(int i=0; i<5; i++){
            System.out.println(List.get(i));
        }

        in.close();

    }
}
