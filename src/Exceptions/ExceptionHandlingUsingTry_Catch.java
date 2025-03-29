package Exceptions;

public class ExceptionHandlingUsingTry_Catch {

	public static void main(String[] args) {

		int i = 2;
		int j = 0;
		String string =null;
		
		int nums[] = new int [5];
		try {
			j = 8 / i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			System.out.println(string.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong..." + e);
		}
		System.out.println(j);
		System.out.println("Bye");

	}

}
