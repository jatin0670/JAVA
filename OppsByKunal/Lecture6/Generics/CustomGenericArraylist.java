import java.util.Arrays;

public class CustomGenericArraylist<T> {
    private int DEFAULT_SIZE = 10;
   private Object[] data;
   private int SIZE = 0;

  public CustomGenericArraylist(){
    this.data = new Object[DEFAULT_SIZE];
   }

   public void add(T val){
      if(isFull()){
         resize();
      }
      data[SIZE++] = val;
   }

   public boolean isFull(){
     return data.length == SIZE;
   }

   public void resize(){
      Object[] temp = new Object[data.length * 2];

      for(int i=0; i<data.length; i++){
         temp[i] = (T)(data[i]);
      }
      data = temp;
   }

   public T get(int index){
      return (T)(data[index]);
   }

   public T remove(){
      T remove = (T)(data[SIZE--]);
      return remove; 
   }

   public int size(){
    return SIZE;
   }

   public void set(int index, T val){
      data[index] = val;
   }

   @Override
   public String toString() {
       return "{" + Arrays.toString(data) + "size = " + SIZE + "}";
   }


   public static void main(String[] args) {
     CustomGenericArraylist list = new CustomGenericArraylist<Integer>();

     for(int i=0; i<14; i++){
        list.add(2*i);
     }

    //  System.out.println(list.toString());

    System.out.println(list.size());

   }


}
