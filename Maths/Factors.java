import java.util.*;

public class Factors {
    public static void main(String[] args) {
        fact3(20);
    }

    // time complexity - O(n)
    static void fact(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }


    // time complexity - O(sqrt(n))
    static void fact2(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    
    // more proper order with both space and time complexity
    static void fact3(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
