import java.util.Arrays;

public class CustomArraylist {
    
   private int DEFAULT_SIZE = 10;
   private int[] data;
   private int SIZE = 0;

  public CustomArraylist(){
    this.data = new int[DEFAULT_SIZE];
   }

   public void add(int val){
      if(isFull()){
         resize();
      }
      data[SIZE++] = val;
   }

   public boolean isFull(){
     return data.length == SIZE;
   }

   public void resize(){
      int[] temp = new int[data.length * 2];

      for(int i=0; i<data.length; i++){
         temp[i] = data[i];
      }
      data = temp;
   }

   public int get(int index){
      return data[index];
   }

   public int remove(){
      int remove = data[SIZE--];
      return remove; 
   }

   public void set(int index, int val){
      data[index] = val;
   }

   @Override
   public String toString() {
       return "{" + Arrays.toString(data) + "size = " + SIZE + "}";
   }


   


   public static void main(String[] args) {
      CustomArraylist list = new CustomArraylist();

      list.add(5);
      list.add(4);
      list.add(3);
      list.add(2);
      list.add(1);
      list.add(6);

   
      System.out.println(list.toString());

      list.remove();
      System.out.println(list.toString());
   }

}
