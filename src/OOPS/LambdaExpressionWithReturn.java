package OOPS;

interface CD {
	int add(int i, int j);
}

public class LambdaExpressionWithReturn {

	public static void main(String[] args) {
		CD obj = (int i, int j) -> {
			return i + j;
		};

		int result = obj.add(5, 6);
		System.out.println(result);

	}

}
