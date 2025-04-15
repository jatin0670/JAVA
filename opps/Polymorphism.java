// based on overloading (argument wise)  ||| other is based on overriding (fn body wise)(not in this example)

class poly{
    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sum(String a, String b){
        System.out.println(a+b);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        poly obj = new poly();
        obj.sum(3, 4);
        obj.sum(3, 5, 7);
        obj.sum("jaitn ", "pratap");
    }
}
