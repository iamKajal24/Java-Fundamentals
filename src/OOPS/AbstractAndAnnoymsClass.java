package OOPS;

abstract class E {
	public abstract void show();
	public abstract void config();
}

public class AbstractAndAnnoymsClass {

	public static void main(String[] args) {

		E obj = new E() {
			public void show() {
				System.out.println("in new show");
			}

			@Override
			public void config() {
				System.out.println("in config class");
				
			}
		};

		obj.show();
		obj.config();

	}

}
