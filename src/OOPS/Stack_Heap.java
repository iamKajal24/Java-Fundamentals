package OOPS;

class Calculator1 {

	int num = 5; // instance variable

	public int add(int n1, int n2) {

		System.out.println(num);
		return n1 + n2;
	}
}

public class Stack_Heap {
	public static void main(String[] args) {
		int data = 12;
		Calculator1 obj = new Calculator1();
		int r1 = obj.add(2, 4);
		System.out.println(r1);
	}
}
