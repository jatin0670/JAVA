class A{
    public void print(){
        System.out.println("class A method");
    }
}


class B extends A{
    public void printB(){
        System.out.println("class B method");
    }
}

class C extends A{
    public void printC(){
        System.out.println("class C method");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();

        objB.print();
        objC.print();
    }
}
