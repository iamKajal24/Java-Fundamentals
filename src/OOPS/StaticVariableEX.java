package OOPS;

class Mobile {
	String brand;
	int price;
	static String name;

	void show() {
		System.out.println(brand + " : " + price + " : " + Mobile.name);
	}
}

public class StaticVariableEX {
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.brand = "Apple";
		obj.price = 1500;
		obj.name = "SmartPhone";

		Mobile obj1 = new Mobile();
		obj1.brand = "Samsung";
		obj1.price = 1700;
		obj1.name = "SmartPhone";

		Mobile obj2 = new Mobile();
		obj2.brand = "OOPO";
		obj2.price = 2500;
		obj2.name = "SmartPhone";

		Mobile.name = "phone";

		obj.show();
		obj1.show();
		obj2.show();
	}

}
