
public class first {

   public static void print(int x){
      if(x==11){
         return;
      }
      System.out.println(x);
      print(x+1);
   }
public static void main(String args[]){

   print(1);

}
    
}
