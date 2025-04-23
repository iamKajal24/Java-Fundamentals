package JavaConversionPrograms;

public class InttoChar {

	public static void main(String[] args) {
		int N = 97;
		char ch = (char) N;

		System.out.println("Character: " + ch);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Output: " + ch + " (Lowercase)");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Output: " + ch + " (Uppercase)");
		} else {
			System.out.println("Output: " + ch + " (Not a letter)");
		}
	}
}