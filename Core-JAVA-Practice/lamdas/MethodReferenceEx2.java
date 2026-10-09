package lamdas;

import java.util.function.Predicate;

public class MethodReferenceEx2 {
    public static void main(String[] args) {

        Predicate<Students> passed = s -> s.marks >= 40;
        Predicate<Students> isAdult = s -> s.age >= 18;

        Predicate<Students> isEligible = passed.and(isAdult);

        System.out.println(isEligible.test(new Students(50, 17)));
    }
}
// and() --> &&
// or() --> ||
// negate() --> !

class Students {
    int marks;
    int age;

    public Students(int marks, int age) {
        this.marks = marks;
        this.age = age;
    }
}
