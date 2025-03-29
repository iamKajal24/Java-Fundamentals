package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import Exceptions.ExceptionHandlingUsingTry_Catch;

public class StreamApIEx2 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 5, 10, 3, 9);

//		Stream<Integer> s1 = nums.stream();
//
//		Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//
//		Stream<Integer> s3 = s2.map(n -> n * 2);
//
//		int result = s3.reduce(0, (c, e) -> c + e);

		
		//filter reduced sorted
//		Predicate<Integer> p = new Predicate<Integer>() {
//			public boolean test(Integer n) {
//				if (n % 2 == 0)
//					return true;
//				else
//					return false;
//			}
//		};
		
		//using lambda expressions
		//Predicate<Integer> p = n-> n%2==0;
		
//		map reduced sorted
		
//		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//			public Integer apply(Integer n) {	
//				return n*2;
//			}
//		};
		
		//Function<Integer, Integer> fun =  n	-> n*2;
				

	//	int result = nums.stream().filter(n -> n % 2 == 0).map(n-> n*2).reduce(0, (c, e) -> c + e);

		Stream<Integer> sortedValues = nums.parallelStream()
				.filter(n -> n % 2 == 0)
				.sorted();
		
		sortedValues.forEach(n->System.out.println(n));

		// s1.forEach(n->System.out.println(n));
		// s3.forEach(n -> System.out.println(n));
		//System.out.println(result);

	}
}
