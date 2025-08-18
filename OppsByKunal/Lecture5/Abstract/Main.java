package Abstract;


public class Main {
    public static void main(String[] args) {
        Son s1 = new Son(23);
        s1.career();
        

        Daughter d1 = new Daughter(32);
        d1.partner();

        Parent.greeting();
        
        

        
    }
}
