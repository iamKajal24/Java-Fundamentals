package JavaOOPS;

class Samosa {

	private static Samosa samosa;

	// constructor
	private Samosa() {

	}

	// lazy way of creating singleton object
	public static Samosa getSamosa() {
		// object of this class
//		Samosa samosa = new Samosa();
//		return samosa;
		if (samosa == null) {
			synchronized (Samosa.class) {
				if (samosa == null) {
					samosa = new Samosa();
				}
			}
		}
		return samosa;
	}
}

public class SingletonDesignPattern {

	public static void main(String[] args) {

		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
	}
}

/*
 * 1. constructor private 2. object create with the help of method 3. create
 * field to store object is private
 * 
 * 
 * 
 */
