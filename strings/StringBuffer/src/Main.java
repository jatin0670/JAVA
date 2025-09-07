import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // constructor 1
         StringBuffer sb = new StringBuffer();
        sb.append("hello this from string buffer");
//        String str = sb.toString();
//        System.out.println(str);


        // constructor 2
        StringBuffer sb2 = new StringBuffer("hello this is constructor 2");
        System.out.println(sb2.toString());

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30); // this is the capacity, default one is 16
        System.out.println(sb3.capacity());


        // some operations -------
//        sb.append("WeMakeDevs");
//        sb.append(" is nice!");
//
//         sb.insert(2, " Rahul ");
//        System.out.println(sb.toString());
//
//        sb.replace(1, 5, "Kushwaha");
//        System.out.println(sb.toString());
//
//        sb.delete(1, 5);
//        System.out.println(sb.toString());

//        int n = 20;
//        String name = random.generate(n);
//        System.out.println(name);

        // remove white spaces
//        String sentence = "jfe hgbeja smdskdf a";
//        System.out.println(sentence.replaceAll("\\s", ""));

        // split
//        String arr = "jogendarjehrila rajurangeela blablabla purrrr";
//        String[] names = arr.split(" ");
//        System.out.println(Arrays.toString(names));


        // round off

        DecimalFormat df = new DecimalFormat("00.000");
        System.out.println(df.format(6.54));
    }
}