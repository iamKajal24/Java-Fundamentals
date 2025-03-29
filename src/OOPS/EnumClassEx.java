package OOPS;

enum Laptopl {
	Macbook(2000), XPS(2200), Surface, ThikPad(1800);

	private int price;

	private Laptopl() {  // default constructor
		price  = 500;
	}

	private Laptopl(int price) { // this is  Parameterized construtor
		this.price = price;
		System.out.println("in laptop " + this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class EnumClassEx {
	public static void main(String[] args) {

//		Laptopl lap = Laptopl.Surface;
//		System.out.println(lap.getClass().getSuperclass());
//		System.out.println(lap + " : " + lap.getPrice());

		// using loop

		for (Laptopl lap : Laptopl.values()) {
			System.out.println(lap + " : " + lap.getPrice());
		}

	}

}
