package strings;

public class GenericsMethods1 {

    public static void main(String args[]) {

        Box1<Integer> b1 = new Box1<Integer>();
        b1.value = 10;
        b1.printDouble();

        Box1<Double> b2 = new Box1<Double>();
        b2.value = 3.14;
        b2.printDouble();

        // Box1<String> b3 = new Box1<String>(); // compile time error

    }

}

// Bounds in Generics
// Upper Bound
// Upper bound --> T is atleast a Number or its subclass

class Box1<T extends Number> { // type parameter
    T value;

    public void printDouble() {
        System.out.println(value.doubleValue());
    }

}
