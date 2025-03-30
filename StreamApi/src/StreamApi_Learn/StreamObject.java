package StreamApi_Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {

		// Stream API - Collection Processing
		// Collection / Group of objects

		// 1. Blank Stream
		Stream<Object> emptyStream = Stream.empty();

		// 2. Stream from an Array
		String[] name = { "Durga", "Uttam", "Anikit", "Divya" };
		Stream<String> names = Stream.of(name);
		names.forEach(System.out::println);

		// 3. Stream using Stream.builder()
		Stream<Object> streamBuilder = Stream.builder().add("A").add("B").add("C").build();
		streamBuilder.forEach(System.out::println);

		// 4. Stream from an array using Arrays.stream()
		IntStream stream = Arrays.stream(new int[] { 2, 4, 65, 3, 67 });
		stream.forEach(System.out::println);

		// 5. Stream from a List
		List<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(45);
		list1.add(47);
		list1.add(67);
		list1.add(13);

		// Creating and using Stream
		// list1.stream().forEach(System.out::println);
		list1.stream().forEach(e -> System.out.println(e));
	}
}
