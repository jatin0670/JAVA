package Abstract;


public abstract class Parent {

    int age;

    Parent(int age){
        this.age = age;
    }

    static void greeting(){
        System.out.println("hello");
    }

    abstract void career();
    abstract void partner();
    
}
