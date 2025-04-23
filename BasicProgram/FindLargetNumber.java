package BasicProgram;

import java.util.ArrayList;
import java.util.Collections;

public class FindLargetNumber {

	public static void main(String[] args) {

		int x = 7, y = 20, z = 56;

		// using ternary operator
		// System.out.println(z > (x > y ? x : y) ? z : ((x > y) ? x : y));

		// using if else
//		if (x > y) {
//			System.out.println("x is gretest");
//		} else if (y > z) {
//			System.out.println("y is gretest");
//		} else if (z > x) {
//			System.out.println("z is greatest");
//		} else {
//			System.out.println("nothing");
//		}

		// using Collections.max()
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(23);
		list.add(100);
		System.out.println(Collections.max(list));

		// using Math.max()
		int largest = Math.max(Math.max(x, y), z);
		System.out.println(largest);
	}

}
