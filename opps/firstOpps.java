class Pen{
   String color;
   String type;


   public void printInfo(){
      System.out.println(this.color);
      System.out.println(this.type);
   }
    
   // non para consturctor------------------

   // Pen(){
   //    System.out.println("Constructor is called");
   // }

   //para constructor --------------   here we dont need to assign values in main function
   Pen(String color, String type){
      this.color = color;  //this.color is a class variable not a construtor variable
      this.type = type;
   }


}

public class firstOpps {
   public static void main(String args[]){
     
    Pen pen1 = new Pen("blue", "gel");

   //  pen1.color = "blue";
   //  pen1.type = "gel";

    pen1.printInfo();

   }    
}
