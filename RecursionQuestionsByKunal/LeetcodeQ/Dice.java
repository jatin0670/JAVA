// fuck this question 😭 btw this is Amazon question

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        // dice("", 4);

        System.out.println(dicelist("", 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target; i++){
            dice(p + i, target-i);
        }
    }

    static ArrayList<String> dicelist(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++){
           ans.addAll(dicelist(p + i, target-i));
        }
        return ans;
    }
}
