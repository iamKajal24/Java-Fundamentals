package OOPS;

public class WrapperCalssesEx {

	public static void main(String[] args) {
		int num = 7;
		// Integer num1 = new Integer(8); // boxing
		Integer num1 = num; // autoboxing

		int num2 = num1.intValue(); // unboxing

		System.out.println(num1);

		String str = "12";
		int num3 = Integer.parseInt(str);
		System.out.println(num3 * 2);
	}
}

//int -> Integer
//char -> character
//double -> double