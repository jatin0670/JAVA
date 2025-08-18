package Abstract;


public class Son extends Parent {
     
  public Son(int age){
        super(age);
    }

    
    @Override
    void career() {
        System.out.println("my name is Jatin");
        
    }


    @Override
    void partner() {
        System.out.println("im gonna be a coder");
        
    }
}
