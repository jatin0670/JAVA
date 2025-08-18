public class Car implements Engain, Brake {
     
    @Override
    public void start() {
        System.out.println("start the car");
        
    }

    @Override
    public void brake() {
        System.out.println("brake the car");
        
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
        
    }

    @Override
    public void acc() {
        System.out.println("acc the car");
        
    }
}
