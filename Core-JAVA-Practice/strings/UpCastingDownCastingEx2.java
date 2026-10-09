package strings;

public class UpCastingDownCastingEx2 {

    public static void main(String[] args) {

        // Generic class Box

        Boxx<Integer> b1 = new Boxx<Integer>(10); // type argument
        // System.out.println(b1.getValue() + 5);

        Boxx<String> b2 = new Boxx<String>("Hello, World!"); // type argument
        // System.out.println(b2.getValue() + " How are you?");

        Boxx<Double> b3 = new Boxx<Double>(3.14); // type argument
        // System.out.println(b3.getValue() + 2.0);

        Boxx<Boolean> b4 = new Boxx<Boolean>(true); // type argument
        // System.out.println(b4.getValue() + " , This is a boolean value.");

        Pair p1 = new Pair(10, 20);
        System.out.println("First: " + p1.first + ", Second: " + p1.second);

        Pair<String, Integer> p2 = new Pair<>("Hello", 10);
        System.out.println("First: " + p2.first + ", Second: " + p2.second);
    }

}

class Boxx<T> { // type parameter
    private T value;

    public Boxx(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Pair<T, U> { // type parameter
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

}
