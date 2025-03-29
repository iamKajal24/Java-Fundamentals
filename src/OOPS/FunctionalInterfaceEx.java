package OOPS;

@FunctionalInterface
interface I {
	void show();
}

//class J implements I {
//
//	@Override
//	public void show() {
//		System.out.println("in show");
//	}
//}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		I obj = new I() {
			public void show() {
				System.out.println("in show");
			}
		};
		obj.show();
	}
}
