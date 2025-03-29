package OOPS;

class calcultaor {
	int a;

	public int add(int num1, int num2) {
		// System.out.println("in add");
		int r = num1 + num2;
		return r;
	}
}

public class Class_And_Object {
	public static void main(String[] args) {
		int num1 = 4, num2 = 5;

		calcultaor calcultaor = new calcultaor();
		int result = calcultaor.add(4, 5);
		System.out.println(result);

//		int result = num1+num2;
//		System.out.println(result);

	}
}
