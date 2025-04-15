interface A{
    public void run();
}

interface B{
    public void run();

}

class C implements A,B{
    public void run(){
        System.out.println("Class C run method");
    }
}


public class Multiple_Inheritance {
    public static void main(String[] args) {
        
    C obj = new C();
    obj.run();


    }
    
}
