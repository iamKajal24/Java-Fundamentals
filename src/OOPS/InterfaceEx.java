package OOPS;

//class- class-> extends
//class-interface->implements
//inter-interface-> extends

interface PP {
	int age = 14; // final and static
	String city = "Mumbai";

	void show();

	void config();
}

interface XX {
	void run();
}

class QQ implements PP, XX {

	public void show() {

		System.out.println("is show ");
	}

	public void config() {
		System.out.println("in Config");

	}

	public void run() {
		System.out.println("running..");

	}

}

public class InterfaceEx {
	public static void main(String[] args) {

		PP obj;
		obj = new QQ();
		obj.show();
		obj.config();

		XX obj1 = new QQ();
		obj1.run();

		System.out.println(PP.age);
		System.out.println(PP.city);
	}

}
