// question - https://leetcode.com/problems/letter-combinations-of-a-phone-number/
//Google question

import java.util.ArrayList;

public class DielPad {
    public static void main(String[] args) {
        // pad("", "12");

        // System.out.println(padlist());

        System.out.println(padcount("", "12"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will give number like '2' - 2
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }


    // return as a list

    static ArrayList<String> padlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this will give number like '2' - 2
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            ans.addAll(padlist(p + ch, up.substring(1)));
        }

        return ans;
    }


    // return the count ------

    static int padcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0'; // this will give number like '2' - 2
        int count = 0;
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            count += padcount(p + ch, up.substring(1));
        }

        return count;
    }
}
