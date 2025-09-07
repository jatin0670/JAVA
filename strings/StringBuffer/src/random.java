import java.util.Random;

public class random {

    static String generate(int n){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for(int i=0; i<n; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}
