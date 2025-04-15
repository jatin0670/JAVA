// we cant use multiple inheritance direclty in java so we use interface

interface Car{
    public void Start();
}

class ElectricCar implements Car{
    public void Start(){
        System.out.println("Electric Car Starts");
    }
}

class DieselCar implements Car{
    public void Start(){
        System.out.println("Diesel Car Starts");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        Car tesla = new ElectricCar();
        Car suburban = new DieselCar();

        tesla.Start();
        suburban.Start();
    }
}
