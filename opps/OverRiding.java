class Bank{
    public void ROI(){
        System.out.println("Rate of interest 5%");
    }
}

class SBI extends Bank{
    @Override
     public void ROI(){
        System.out.println("Rate of interest 6%");
     }
}

public class OverRiding {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.ROI();
    }
}
