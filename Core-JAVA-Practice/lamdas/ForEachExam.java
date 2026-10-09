package lamdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachExam {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        // for (Integer i : list) {
        //     System.out.println(i);
        // }

         list.forEach(System.out::println);
    }

}
