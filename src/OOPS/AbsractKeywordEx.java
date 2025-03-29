package OOPS;

abstract class Car {

	public abstract void drive();

	public abstract void fly();

	public void playMusic() {
		System.out.println("play music...");
	}
}

abstract class WagonR extends Car { // you can't create abstract class object
	public void drive() {
		System.out.println("Driving...");
	}
}

class updatedWagnR extends WagonR {

	public void fly() {
		System.out.println("flying...");

	}
}

public class AbsractKeywordEx {

	public static void main(String[] args) {
		Car obj = new updatedWagnR();
		obj.drive();
		obj.playMusic();
		obj.fly();
	}

}
