package lamdas;

import java.util.function.Supplier;

public class SupplierInterFaceEx {

    public static void main(String[] args) {

        // Supplier<Integer> s = () -> 10;
        // System.out.println(s.get());

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }

}
