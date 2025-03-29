package OOPS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Kajal", "Navin", "John", "Lakshmi");

//		Optional<String> name = names.stream()
//				.filter(str -> str.contains("x")).
//				findFirst();

		String name = names.stream()
				.filter(str -> str.contains("x"))
				.findFirst()
				.orElse("Not Found");

//		System.out.println(name.get());  -> name.get()->error

		System.out.println(name);
	}

}
