package OOPS;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Kajal", "Harsh", "John");

		List<String> uNames = names.stream().map(name -> name.toUpperCase()).toList();
		System.out.println(uNames);

//		uNames.forEach(i->System.out.println(i));
//		or
		uNames.forEach(System.out::println);
	}
}
