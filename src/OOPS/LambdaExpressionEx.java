package OOPS;

@FunctionalInterface
interface AB {
	void show(int i);
}

public class LambdaExpressionEx {

	public static void main(String[] args) {
		AB obj = (int i) -> {System.out.println("in show " + i);};
		obj.show(5);

	}

}
