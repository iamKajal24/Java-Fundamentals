package OOPS;

interface Computer1 {
	public abstract void code();
}

class Laptop1 implements Computer1 {
	public void code() {
		System.out.println("code,compile,run");
	}
}

class Desktop implements Computer1 {
	public void code() {
		System.out.println("code,compile,run : fatser");
	}
}

class Developer {
	public void devApp(Computer1 lap) {
		lap.code();
	}
}

public class NeedOfInterface {

	public static void main(String[] args) {
		Computer1 laptop = new Laptop1();
		Computer1 desktop = new Desktop();
		Developer kajal = new Developer();
		kajal.devApp(desktop);
	}

}
