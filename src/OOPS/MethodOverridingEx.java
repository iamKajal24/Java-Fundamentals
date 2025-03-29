package OOPS;

class Calculatorr {

	public int add(int n1, int n2) {
		return n1 + n2;
	}
}

class AdvCalculator extends Calculatorr {
	public int add(int n1, int n2) {
		return n1 + n2 + 1;
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		AdvCalculator obj = new AdvCalculator();
		int r1 = obj.add(3, 7);
		System.out.println(r1);

	}
}
