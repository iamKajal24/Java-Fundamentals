package OOPS;

class Mobile3 {
	int price;
	String brand;
	static String name;

	public Mobile3() {
		brand = "";
		price = 200;
		System.out.println("in construtor");
	}

	static {
		name = "phone";
		System.out.println("in static block");
	}

	public void show() {
		System.out.println(brand + " : " + price + " : " + name);
	}
}

public class StaticBlockEx {
	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("OOPS.Mobile3");

//		Mobile3 obj1 = new Mobile3();
//		obj1.price = 15000;
//		obj1.brand = "samsung";
//		Mobile3.name = "smartPhone";

//		Mobile3 obj2 = new Mobile3();
//		obj2.price = 20000;
//		obj2.brand = "Oppo";
//		Mobile3.name = "smartphone";

	}
}
