package lamdas;

import java.util.function.Consumer;

public class MethodReferenceEx3 {
    public static void main(String[] args) {
        Consumer<String> printName = System.out::println;
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        Consumer<String> pipeline = printName.andThen(printUpperCase);

        pipeline.accept("kajal");
    }
}
