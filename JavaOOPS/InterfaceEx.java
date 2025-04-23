package JavaOOPS;

interface vehicle {
	void changeGear(int a);

	void speedup(int a);

	void applyBrakes(int a);
}

class Bicycle implements vehicle {
	int speed;
	int gear;

	public void changeGear(int newGear) {
		gear = newGear;

	}

	public void speedup(int increment) {
		speed = speed + increment;

	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;

	}

	public void printStates() {
		System.out.println("speed : " + speed + " gear :" + gear);
	}
}

class Bike implements vehicle {
	int speed;
	int gear;

	public void changeGear(int newGear) {
		gear = newGear;
	}

	public void speedup(int increment) {
		speed = speed + increment;

	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;

	}

	public void printStates() {
		System.out.println("speed : " + speed + " gear :" + gear);
	}
}

public class InterfaceEx {

	public static void main(String[] args) {

		// Instance of Bicycle (object)
		Bicycle bicycle = new Bicycle();

		bicycle.changeGear(2);
		bicycle.speedup(3);
		bicycle.applyBrakes(1);

		System.out.println("Bicycle present state : ");
		bicycle.printStates();

		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedup(4);
		bike.applyBrakes(3);

		System.out.println("Bike present state : ");
		bike.printStates();
	}
}
