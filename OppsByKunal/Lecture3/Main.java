

public class Main {

    public static void main(String[] args) {

        // this part is box file
        // Box box1 = new Box();
        // Box box2 = new Box(2,4,2);

        // System.out.println(box1.h +" "+ box1.w +" "+ box1.l);
        // System.out.println(box2.h +" "+ box2.w +" "+ box2.l);




        // this is inheritance part
        // ---- this is doing normal constructor
        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.weight);


        // ---- this is first go to BoxWeight then Box for lhb through super keyword
        // BoxWeight box4 = new BoxWeight(3,4,5,6);
        // System.out.println(box4.l + " " + box4.h +" "+ box4.w +" "+ box4.weight);


        // BoxPrice box5 = new BoxPrice();
        // System.out.println(box5.price);

        BoxPrice box6 = new BoxPrice(5, 3, 6, 12, 300);
        System.out.println(box6.h);
        
        


    }
}