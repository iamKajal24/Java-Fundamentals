package JavaConversionPrograms;

public class StringtoLong {

	public static void main(String[] args) {

		String numberString = "1234567890";

		long num1 = Long.parseLong(numberString);

		long num2 = Long.valueOf(numberString);

		System.out.println("Converted using Long.parseLong(): " + num1);
		System.out.println("Converted using Long.valueOf(): " + num2);
	}
}
