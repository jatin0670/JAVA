public class Stream {
    public static void main(String[] args) {
        // skip("", "accabada");
       System.out.println(skip2("abcaafd")); 
    }


    //this algo has 2 strings (more space required)
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }


    //proper algo without taking extra space 
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip2(up.substring(1));
        }
        else{
            return ch + skip2(up.substring(1));
        }
    }
}
