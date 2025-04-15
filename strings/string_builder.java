// import java.util.*;

public class string_builder {
    public static void main(String args[]){
        //create StringBuilder ---------------
        StringBuilder sb = new StringBuilder("jatin");
        System.out.println(sb);

        //charAt operation at index 2----------------------
        // System.out.println(sb.charAt(2));

        //set or exchange char at index 2---------------------
        // sb.setCharAt(2, 'a');
        // System.out.println(sb);

        //insert operation at index 2---------------------
        //   sb.insert(2, 't');
        //   System.out.println(sb);

        //delete operation -  2t  end index wont be include 
        //   sb.delete(2,4);
        //   System.out.println(sb);
        
        //add char at end 
        sb.append('z');
        System.out.println(sb);

    }
}
