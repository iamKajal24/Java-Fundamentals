package BasicProgram;

class ComplexNumber {

	int real, image;

	public ComplexNumber(int r, int i) {
		this.real = r;
		this.image = i;
	}

	public void showC() {
		System.out.println(this.real + " +i" + this.image);
	}

	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res = new ComplexNumber(0, 0);
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;
		return res;
	}
}

public class AddComplexNumbers {

	public static void main(String[] args) {

		ComplexNumber c1 = new ComplexNumber(4, 5);
		ComplexNumber c2 = new ComplexNumber(6, 8);

		System.out.println("First complex number:");
		c1.showC();

		System.out.println("Second complex number:");
		c2.showC();

		ComplexNumber result = ComplexNumber.add(c1, c2);

		System.out.println("Addition is:");
		result.showC();
	}
}
