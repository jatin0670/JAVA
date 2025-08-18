public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice(){
    this.price = -1;
    }

    BoxPrice(double l, double h, double w, double weight, double price){
        super(l,h,h,w);
        this.price = price;
    }
}
