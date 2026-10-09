public class InterfaceEx {

    public static void main(String[] args) {
        Car1 car = new FuelCar1();
        car.start();
        car.accelator();
        car.brake();
    }

}

interface Car1 {

    void start();

    void accelator();

    void brake();
}

class ElectricCar1 implements Car1 {

    @Override
    public void start() {
        System.out.println("electric car has started");
    }

    @Override
    public void accelator() {
        System.out.println("Electric car is accelatoring");
    }

    @Override
    public void brake() {
        System.out.println("electio car is stopping");
    }

}

class FuelCar1 implements Car1 {

    @Override
    public void start() {
        System.out.println("Fuel car has started");
    }

    @Override
    public void accelator() {
        System.out.println("Fuel car is accelatoring");
    }

    @Override
    public void brake() {
        System.out.println("Fuel car is stopping");
    }
}