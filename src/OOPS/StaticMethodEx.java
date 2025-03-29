package OOPS;

class Mobile1 {
	String brand;
	int price;
	static String name;

	public void show() {
		System.out.println(brand + " : " + price + " : " + Mobile1.name);
	}

	public static void show1(Mobile1 obj2) {
		System.out.println(obj2.brand + " : " + obj2.price + " : " + Mobile1.name);
	}
}

public class StaticMethodEx {
	public static void main(String[] args) {
		Mobile1 obj = new Mobile1();
		obj.brand = "Apple";
		obj.price = 15000;
		obj.name = "Smartphone";

		Mobile1 obj1 = new Mobile1();
		obj1.brand = "OOPO";
		obj1.price = 18000;
		obj1.name = "Smartphone";

		Mobile.name = "phone";

		obj.show();
		obj1.show();

		Mobile1.show1(obj);

	}

}
