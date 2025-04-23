package JavaConversionPrograms;

public class LongToString {

	public static void main(String[] args) {
		long number = 123456789L;
		String str1 = String.valueOf(number);
		String str2 = Long.toString(number);

		System.out.println("Original long value: " + number);
		System.out.println("Converted to String using String.valueOf(): " + str1);
		System.out.println("Converted to String using Long.toString(): " + str2);
	}
}
