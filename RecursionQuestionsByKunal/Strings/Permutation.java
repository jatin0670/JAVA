import java.util.ArrayList;


public class Permutation {
    public static void main(String[] args) {
        // per("", "abc");

    //    ArrayList<String> ans = perlist("", "abc");
    //    System.out.println(ans);

    System.out.println(percount("", "abc"));
       
       
    }

    static void per(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            per(f + ch + s, up.substring(1));
        }
    }

    // return array list

    static ArrayList<String> perlist(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(perlist(f + ch + s, up.substring(1)));
        }

        return ans;

    }


    // permutaion count -----

    static int percount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += percount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
