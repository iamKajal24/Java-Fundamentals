package Exceptions;

class kajalException extends Exception {
	public kajalException(String string) {
		super(string);
	}
}

public class CustomExceptions {

	public static void main(String[] args) {

		int i = 20;
		int j = 0;

		try {
			j = 18 / i;
			if (j == 0)
				throw kajalException("i dont want to prize zero");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("something went wrong...");
		}

	}

	private static Exception kajalException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
