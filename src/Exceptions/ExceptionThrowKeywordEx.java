package Exceptions;

public class ExceptionThrowKeywordEx {
	
	public static void main(String[] args) {
		
		int i =20;
		int j =0;
		
		try {
			j =18/i;
			
			if (j==0)
				throw new ArithmeticException();
		}
		catch (ArithmeticException e) {
			j=18/1;
			System.out.println("Cannot divided by zero..");
		}
		catch (Exception e) {
			System.out.println("something went wrong..");
		}
		
	}
}
