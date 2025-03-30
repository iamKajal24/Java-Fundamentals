package StreamApi_Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {

		// create a list and filter all even numbers from list

		List<Integer> list = Arrays.asList(34, 12, 45, 56, 3, 74, 36, 100); // immutable-> don't change

		List<Integer> list1 = new ArrayList<Integer>(); // this is mutable -> can be change
		list1.add(4);
		list1.add(45);
		list1.add(47);
		list1.add(67);
		list1.add(13);

		List<Integer> nums = List.of(2, 4, 5, 1, 7, 9, 3);// immutable

		// list 1
		// without Stream
		List<Integer> listEven = new ArrayList<Integer>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(list);
		System.out.println(listEven);

		// using stream api
//		Stream<Integer> stream = list.stream();
//		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println("New List : " + newList);

		List<Integer> newlist = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("new List  : " + newlist);

		List<Integer> bigNums = list.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println("greatest number : " + bigNums);
        
        
	}
}
