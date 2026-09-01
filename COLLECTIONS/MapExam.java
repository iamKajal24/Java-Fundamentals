import java.util.HashMap;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {
       
        Map<Integer,String> map = new HashMap<>();

        // put method-> adds a key-value pair to the map
        map.put(1, "kajal");
        map.put(2, "shubham");
        map.put(3, "khushi");
        System.out.println("map : " + map);

        // get method-> returns the value associated with the specified key, or null if the key is not present in the map
        System.out.println("get : " + map.get(2));

        // containsKey method-> returns true if the map contains the specified key, false otherwise
        System.out.println("containsKey : " + map.containsKey(2));

        // containsValue method-> returns true if the map contains the specified value, false otherwise
        System.out.println("containsValue : " + map.containsValue("shubham"));

        //put method-> adds a key-value pair to the map, returns the previous value associated with the key, or null if there was no mapping for the key
        System.out.println("put : " + map.put(3, "riya"));
        System.out.println("after put : " + map);

        //isEmpty method-> returns true if the map is empty, false otherwise
        System.out.println("isEmpty : " + map.isEmpty());

        //get or default method-> returns the value associated with the specified key, or the default value if the key is not present in the map
        System.out.println("getOrDefault : " + map.getOrDefault(4, "not found"));

        //size method-> returns the number of key-value pairs in the map
        System.out.println("size : " + map.size());

        //remove method-> removes the key-value pair associated with the specified key, returns the value associated with the key, or null if the key is not present in the map
        System.out.println("remove : " + map.remove(3));
        System.out.println("after remove : " + map);

        //putIfAbsent method-> adds a key-value pair to the map if the specified key is not already present in the map, returns the previous value associated with the key, or null if there was no mapping for the key
        System.out.println("putIfAbsent : " + map.putIfAbsent(3, "riya"));
        System.out.println("after putIfAbsent : " + map);

        //replace method-> replaces the value associated with the specified key, returns the previous value associated with the key, or null if the key is not present in the map
        System.out.println("replace : " + map.replace(3, "Priya"));
        System.out.println("after replace : " + map);

        //replaceAll method-> replaces the value associated with the specified key if the key is present in the map, returns true if the value was replaced, false otherwise
        map.replaceAll((key,value)->value.toUpperCase());
        System.out.println("after replaceAll : " + map);

        //compute method-> computes a new value for the specified key if the key is present in the map, returns the new value associated with the key, or null if the key is not present in the map
        map.compute(3, (key,value)->value+" kumari");
        System.out.println("after compute : " + map);

        //computeIfAbsent method-> computes a new value for the specified key if the key is not present in the map, returns the new value associated with the key, or null if the key is present in the map
        map.computeIfAbsent(4, key->"riya");
        System.out.println("after computeIfAbsent : " + map);

        //computeIfPresent method-> computes a new value for the specified key if the key is present in the map, returns the new value associated with the key, or null if the key is not present in the map
        map.computeIfPresent(4, (key,value)->value+" kumari");
        System.out.println("after computeIfPresent : " + map);

        //merge method-> merges the specified value with the existing value associated with the specified key if the key is present in the map, returns the new value associated with the key, or null if the key is not present in the map
        map.merge(4, " Sharma", (oldValue,newValue)->oldValue+newValue);
        System.out.println("after merge : " + map);

        //hashCode method-> returns the hash code value for the map
        System.out.println("hashCode : " + map.hashCode());

        //hasmap method-> returns true if the map is equal to the specified object, false otherwise
        System.out.println("equals : " + map.equals(map));

        //hashmap travel method-> returns a set view of the mappings contained in the map
        for (String value : map.values()){
           System.out.println("Value : " + value);
        }

        //entrySet method-> returns a set view of the mappings contained in the map
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + " value :" + entry.getValue());
        }
        //or
        map.forEach((key,value)-> System.out.println(key+ " = " + value));
        
        //clear method-> removes all key-value pairs from the map
        // map.clear();
        // System.out.println("after clear : " + map);
    }
    
}
