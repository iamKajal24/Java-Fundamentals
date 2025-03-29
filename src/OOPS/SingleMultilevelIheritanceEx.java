package OOPS;

class Calcu { // Calc is super class
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}

class AdvCalcu extends Calcu { // AdvCalc is Subclass
	public int mul(int n1, int n2) {
		return n1 * n2;
	}

	public int div(int n1, int n2) {
		return n1 / n2;
	}
}

class VeryAdvCalc extends AdvCalcu{
	public double power(double n1,double n2) {
		return Math.pow(n1, n2);
	}
}

public class SingleMultilevelIheritanceEx {
	public static void main(String[] args) {
		VeryAdvCalc obj = new VeryAdvCalc();
		int r1 = obj.sum(3, 5);
		int r2 = obj.sub(5, 3);
		int r3 = obj.mul(5, 2);
		int r4 = obj.div(64, 8);
		double r5 = obj.power(4, 4);

		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4+" "+ r5);
	}
}
