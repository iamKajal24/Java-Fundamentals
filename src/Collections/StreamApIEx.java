package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApIEx {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 5, 67, 8);

//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}

//		for(int n : nums) {
//			System.out.println(n);
//		}

		/* best solution */

//		Consumer<Integer> con = new Consumer<Integer>() { -> consumer interface is the functional interface
//			public void accept(Integer n) {
//				System.out.println(n);
//			}
//		};

		// Consumer<Integer> con = (n) ->System.out.println(n);

		nums.forEach((n) -> System.out.println(n));

//		int sum = 0;
//		for (int n : nums) {
//			if (n % 2 == 0) {
//				n = n * 2;
//				sum = sum + n;
//			}
//		}
//
//		System.out.println(sum);

	}

}
