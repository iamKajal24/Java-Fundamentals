package lamdas;

import java.util.function.Predicate;

public class PredicateInterFaceEx {

    public static void main(String[] args) {
        Predicate<Integer> p = (a) -> a > 10;
        System.out.println(p.test(20));

        Predicate<String> p1 = (s) -> s.length() > 5;
        System.out.println(p1.test("Hello"));

        Predicate<String> p2 = (s) -> s.isEmpty();
        System.out.println(p2.test(""));
    }

}
