package lamdas;

import java.util.function.Consumer;

public class ConsumerInterfaceEx {

    public static void main(String[] args) {

        Consumer<Integer> c = (a) -> System.out.println(a);
        c.accept(5);

    }

}
