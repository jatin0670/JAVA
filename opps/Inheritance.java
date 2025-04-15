
class Animal{
   void Sound(){
    System.out.println("Animal makes sound");
   }
}

class Dog extends Animal{
    void noise(){
       super.Sound();
    }
}


public class Inheritance {
    public static void main(String args[]){
        Dog d1 = new Dog();
        d1.noise();
    }
}
