package JavaOOPS;

class Stud {
	private String name;
	private int rollno;
	private String address;

	public Stud(String name, int rollno, String address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	public Stud() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void dispaly() {
		System.out.println("NAME : " + name);
		System.out.println("ADDRESS : " + address);
		System.out.println("ROLL NO : " + rollno);
	}

}

public class EncapsulationEx {

	public static void main(String[] args) {

		Stud stud = new Stud();

		stud.setName("Kajal");
		stud.setAddress("Haridwar");
		stud.setRollno(101);

		stud.dispaly();

	}

}
