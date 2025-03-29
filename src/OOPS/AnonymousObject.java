package OOPS;

class AA{
	public AA() {
		System.out.println("Object Created");
	}
	public void show() {
		System.out.println("is A show");
	}
}

public class AnonymousObject {
	public static void main(String[] args) {
		 new AA().show(); //anonymous object
	}
}
