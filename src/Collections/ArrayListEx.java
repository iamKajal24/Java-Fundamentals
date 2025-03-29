package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(100);
		nums.add(30);
		nums.add(50);
		nums.add(45);

		System.out.println(((ArrayList<Integer>) nums).indexOf(100));

		System.out.println(((ArrayList<Integer>) nums).get(2));

		for (int num : nums) {
			System.out.print(num * 2 + " ");
		}
	}

}
