package JavaOOPS;

abstract class sunstar {
	abstract void print();
}

class employee extends sunstar {

	void print() {
		String name = "Kajal";
		int age = 26;
		double salary = 100000.0d;

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);

	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		sunstar sunstar = new employee();
		sunstar.print();

	}
}
