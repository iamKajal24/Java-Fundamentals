package OOPS;

class D {
	public void show() {
		System.out.println("in D show");
	}

}



public class AnonymousInnerClassEx {

	public static void main(String[] args) {
		D obj = new D() {
			public void show() {
				System.out.println("in new show");
			}
		};

		obj.show();
	}
}
