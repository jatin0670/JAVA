
public class Main {
    public static void main(String[] args) throws Exception{
          String str = "aabccd";
          HuffmanCoder hf = new HuffmanCoder(str);
          String cs = hf.encode(str);
          System.out.println(cs);

          String ds = hf.decode(cs);
          System.out.println(ds);
    }
}