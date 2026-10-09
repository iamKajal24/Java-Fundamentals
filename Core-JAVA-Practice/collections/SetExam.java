package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        // Constructors of HashSet/ LinkedHashSet

        Set<Integer> set = new LinkedHashSet<>();

        // initial capacity
        Set<Integer> set2 = new LinkedHashSet<>(100);

        // capacity, Load Factor
        Set<Integer> set3 = new LinkedHashSet<>(100, 0.8f);

        // Using another collection
        Set<Integer> set4 = new LinkedHashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

}
