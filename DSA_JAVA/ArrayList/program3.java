/*Write a program to sort an ArrayList of Strings in desecding order */

import java.util.ArrayList;
import java.util.Collections;

public class program3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(100);
        
        System.out.println("Original List : " + list);

        Collections.sort(list);
        System.out.println("Ascending Orders : " + list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Desending Order : "+list);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Kajal");
        l1.add("Mahadev");
        l1.add("Amrita");
        l1.add("Rahul");
        l1.add("Dharmesh");
        l1.add("Kalicharan");
        l1.add("Bablu");

        System.out.println("Original List :" + l1);

        Collections.sort(l1);
        System.out.println("Sorted List : " + l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Desending order : " + l1);

    }
}
