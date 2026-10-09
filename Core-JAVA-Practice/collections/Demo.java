package collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // List<Integer> list = new LinkedList<>();
        // Collection<Integer> list = new ArrayList<>();
        // Collection<Integer> list = new HashSet<>();
        // Collection<Integer> list = new ArrayDeque<>();
        Collection<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // printing the list
        // System.out.println(list);

        // Using for-each loop
        // for (Integer i : list) {
        // System.out.println(i);
        // }

        // Using Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
