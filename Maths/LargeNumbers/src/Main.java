import java.math.BigDecimal;
import java.math.BigInteger;

// working on large data use biginteger
public class Main {
    public static void main(String[] args) {
        BD();
    }

    static void BD(){
//       double x = 0.03;              getting wrong ans
//       double y = 0.04;
//       double ans = y-x;
//        System.out.println(ans);


        BigDecimal A = new BigDecimal("0.03");
        BigDecimal B = new BigDecimal("0.04");
        BigDecimal ans = B.subtract(A);
        System.out.println(ans);

        // we can do many operations on decimal like integer

        // constant

        BigDecimal C = BigDecimal.TEN;
    }

    static void BI(){
        // normal implementation
        int a = 23;
        int b = 65;

        BigInteger A = BigInteger.valueOf(34);
        BigInteger B = BigInteger.valueOf(35564564);

        BigInteger C = new BigInteger("16465734485347553787284356");
        BigInteger X = new BigInteger("573485732759756234975374657");

        //constants
        BigInteger D = BigInteger.TEN;


        // add and so on other operations
        BigInteger s = C.add(X);
//        System.out.println(s);

        System.out.println(factorial.fact(100));

    }
}