package OOPS;

class Human1 {
	private int age;
	private String name;

	public Human1() { // default constructor
		System.out.println("in construtor");
	}

	public Human1(int age, String name) { // parameterised construtor
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ConstrutorEx {
	public static void main(String[] args) {
		Human1 obj = new Human1();
		obj.setAge(26);
		obj.setName("Riya Pandit");

		System.out.println(obj.getAge() + " : " + obj.getName());
	}
}
