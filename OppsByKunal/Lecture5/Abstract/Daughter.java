package Abstract;


public class Daughter extends Parent {

    Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("my name is kenzi");
        
    }

    @Override
    void partner() {
        System.out.println("im gonna be professor");
        
    }
}
