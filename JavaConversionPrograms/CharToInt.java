package JavaConversionPrograms;

public class CharToInt {

	public static void main(String[] args) {
		char ch = '3';
		if (Character.isDigit(ch)) {
			int num = ch - '0';
			System.out.println("Output: " + num);
		} else {
			System.out.println("The character is not a digit.");
		}
	}
}
