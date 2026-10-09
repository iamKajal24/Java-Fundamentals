public class MethodOverridingEx {

    public static void main(String[] args) {

        Animals animals = new Dog();
        animals.run();

    }

}

abstract class Animals {

    abstract void run();

}

class Dog extends Animals {

    @Override
    void run() {
        System.out.println("Dog is running");
    }

}

class Duck extends Animals {

    @Override
    void run() {
        System.out.println("Duck is running");
    }

}

class Human extends Animals {

    @Override
    void run() {
        System.out.println("Human is running");
    }

}
