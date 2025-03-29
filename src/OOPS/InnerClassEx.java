package OOPS;

class X {

	int age;

	public void show() {
		System.out.println("in showing...");
	}

	class Y {

		public void Config() {
			System.out.println("in Config...");
		}
	}
}

public class InnerClassEx {

	public static void main(String[] args) {
		X objX = new X();
		objX.show();

		X.Y objY = objX.new Y();
		objY.Config();

	}

}
