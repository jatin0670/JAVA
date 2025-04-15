public class sumOfNaturalNums{

    public static void sum(int first, int last, int sum){
        if(first==last){
           sum+=first;
           System.out.println(sum);
           return;
        }
        sum+=first;
        sum(first+1, last, sum);
        
    }
    public static void main(String args[]){
       sum(1,5,0);
    }
}