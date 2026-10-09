package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {
          Set<String> set = new HashSet<>();

        set.add("Aditya");
        set.add("Rohit");
        set.add("Rohan");

        //System.out.println(set.contains("Abhay"));

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Aditya");
        map.put(102, "Rohit");
        map.put(103, "Aditya");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(102));
    }
    
}
