package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ParallelStreamEx {

	public static void main(String[] args) {
		int size = 10_000;
		List<Integer> nums = new ArrayList<Integer>(10000);

		Random ran = new Random();

		for (int i = 1; i <= size; i++) {
			nums.add(ran.nextInt(100));
		}

//		System.out.println(nums);

		int sum1 = nums.stream().map(i -> {

			try {
				Thread.sleep(1);
			} catch (Exception e) {
			}
			return i * 2;

		}).reduce(0, (c, e) -> c + e);

		long startSeg = System.currentTimeMillis();
		int sum2 = nums.stream().map(i -> i * 2).mapToInt(i -> i).sum();
		long endSeq = System.currentTimeMillis();

		long startPara = System.currentTimeMillis();
		int sum3 = nums.parallelStream().map(i -> i * 2).mapToInt(i -> i).sum();
		long endPara = System.currentTimeMillis();

		System.out.println(sum1 + " : " + sum2 + "  : " + sum3);
		System.out.println("seq : " + (endSeq - startSeg));
		System.out.println("para : " + (endPara - startPara));

	}

}
