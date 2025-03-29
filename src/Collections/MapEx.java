package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapEx {
	
	public static void main(String[] args) {
		Map <String,Integer> students = new HashMap<String, Integer>();
	//	Map <String,Integer> students = new Hashtable<String, Integer>();
		students.put("navin", 56);
		students.put("kajal", 23);
		students.put("lakshman", 56);
		students.put("karan", 12);
		students.put("kajal", 45);
		
		
		System.out.println(students);
		
		System.out.println(students.keySet());
		
		for(String key : students.keySet()) {
			System.out.println(key + " : "+ students.get(key));
		}
	}

}
