package OOPS;

class P {

	public void show1() {
		System.out.println("in A show");
	}

}

class Q extends P {
	public void show2() {
		System.out.println("in B show");
	}
}

public class UpCastingAndDownCastingEx {

	public static void main(String[] args) {

		// typecasting and downcasting
//		double d = 4.5;
//		int i =(int)d;
//		System.out.println(i);

		P obj = new Q(); // this is upcasting
		obj.show1();

		Q obj1 = (Q) obj; // This is downcasting
		obj1.show2();
	}

}
