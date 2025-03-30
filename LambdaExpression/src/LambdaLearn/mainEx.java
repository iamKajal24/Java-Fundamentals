package LambdaLearn;

public class mainEx {

	public static void main(String[] args) {
		System.out.println("My System starts...");

// create separate class and implements this interface
//		MyInterface myInterface = new MyInterImpl();
//		myInterface.sayHello();	
		// end

		// anonymous class for implementing interface
//		MyInterface i = new MyInterface() {
//			@Override
//			public void sayHello() {
//				System.out.println("This is my first anonymous class");
//			}
//		};
//		i.sayHello();
//
//		MyInterface i2 = new MyInterface() {
//			@Override
//			public void sayHello() {
//				System.out.println("This is my second class ");
//			}
//		};
//		i2.sayHello();
		// end

		// using our interface with the help of lambda
		MyInterface i2 = () -> System.out.println("This is my second class ");
		i2.sayHello();

		MyInterface i = () -> System.out.println("this is second time i am using lambda");
		i.sayHello();

		// sumInterFace
		SumInter sumInter = (int a, int b) -> {
			return a + b;
		};
		System.out.println(sumInter.sum(5, 6));
		System.out.println(sumInter.sum(6, 7));

		SubInter subInter = ( a, b) -> a - b;
		System.out.println(subInter.sub(7, 3));
		
		LengthInter lengthInter = (str)->str.length();
		System.out.println("Length of the String is  : "+lengthInter.getLength("Kajal Pandit"));
	}
}
