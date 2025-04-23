package JavaConversionPrograms;

public class BooleanToString {

	public static void main(String[] args) {

		boolean value1 = true;
		boolean value2 = false;

		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);

		String str3 = Boolean.toString(value1);
		String str4 = Boolean.toString(value2);

		// Output
		System.out.println("String value of 'true' using String.valueOf(): " + str1);
		System.out.println("String value of 'false' using String.valueOf(): " + str2);
		System.out.println("String value of 'true' using Boolean.toString(): " + str3);

	}

}
