public class AbstractEx {

    public static void main(String[] args) {

        Car car = new fuleCar();
        car.start();
        car.accelator();
        car.brake();

    }

}

abstract class Car {
    void start() {
        System.out.println("car started");
    }

    abstract void accelator();

    abstract void brake();
}

class fuleCar extends Car {

    @Override
    void accelator() {
        System.out.println("fule car is accelatoring");
    }

    @Override
    void brake() {
        System.out.println("fuel car is stopping");
    }

}

class electricCar extends Car {

    @Override
    void accelator() {
        System.out.println("electric car is accelatoring");
    }

    @Override
    void brake() {
        System.out.println("electric car is stopping");
    }

}