package OOPS;

class A1{
	 int marks = 6;
}
class BB{
	private int marks;
}

public class AccessModifierEx {
	public static void main(String[] args) {
		A1 ob = new A1();
		System.out.println(ob.marks);
		
		BB obj = new BB();
	   // System.out.println(obj.marks);
	}

}
