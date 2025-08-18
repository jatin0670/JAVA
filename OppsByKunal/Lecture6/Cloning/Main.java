import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ayush = new Human("ayush", 19);
        // Human twin = new Human(ayush);   ----not the good way to clone an object

        // Human twin = (Human)ayush.clone();

        System.out.println(ayush.name +" "+ ayush.age);
        System.out.println(Arrays.toString(ayush.arr));




        // deep copy
        Human twin = (Human)ayush.clone();
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));




       
    }
}
