package OOPS;

import java.util.Objects;

class Laptop {

	String model;
	int price;

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

//	public boolean equals(Laptop that) {
//			
//		return this.model.equals(that.model) && this.price == that.price;
//	}

}

public class ObjectClassEqualsToHashCode {
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.model = "Dell";
		obj.price = 127899;

		Laptop obj1 = new Laptop();
		obj.model = "Dell";
		obj.price = 127899;

		boolean result = obj.equals(obj1);
		System.out.println(result);

	}
}
