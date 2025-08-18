public class BoxWeight extends Box {
    double weight;
    

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);   // this calls the parent class constructor 
        this.weight = weight;
    }
    
    @Override
    Box(){

    }
}
