package lamdas;

import java.util.*;
import java.util.function.Function;

public class FunctionInterfaceEx {

    public static void main(String[] args) {

        Function<Integer, Integer> f = (a) -> a * a;
        System.out.println(f.apply(5));

    }

}
