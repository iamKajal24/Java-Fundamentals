package OOPS;

class AAAA {
	public void show() {
		System.out.println("A in show");
	}
}

class BBBB extends AAAA {

	public void show() {
		System.out.println("B in show");
	}
}

class CCCC extends AAAA {

	public void show() {
		System.out.println("C in show");
	}

}

public class DynamicMathodDispatcherEx {
	public static void main(String[] args) {
		AAAA obj = new AAAA();
		obj.show();

		obj = new BBBB();
		obj.show();

		obj = new CCCC();
		obj.show();

	}
}
