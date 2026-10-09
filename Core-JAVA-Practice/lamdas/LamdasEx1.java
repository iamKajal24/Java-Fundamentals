package lamdas;

public class LamdasEx1 {

    public static void main(String[] args) {
        Calculator c = (a, b) -> a * b;

        // print(10, 20, (a, b) -> a + b);

        print(10, 20, c);

    }

    static void print(int a, int b, Calculator c) {
        System.out.println(c.add(a, b));
    }

}

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

// class Addition implements Calculator{
// @Override
// public int add(int a, int b) {
// return a+b;
// }
// }
