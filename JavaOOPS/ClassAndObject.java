package JavaOOPS;

class Student {
	int rollno;
	String name;

	public void display() {
		System.out.println("Roll No: " + rollno);
		System.out.println("Name: " + name);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {

		Student student = new Student();

		student.rollno = 101;
		student.name = "Kajal";

		student.display();
	}
}
