import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExam {

    public static void main(String[] args) {
        
        Map<Integer, Character> map = new LinkedHashMap<>();

        // put method-> adds a key-value pair to the map  
        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');
        System.out.println("map : " + map);
        
        
    }
    
}
