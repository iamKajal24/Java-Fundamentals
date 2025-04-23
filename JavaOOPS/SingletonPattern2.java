package JavaOOPS;

class Jalebi {

	// egaer way of creating singleton object
	private static Jalebi jalebi = new Jalebi();

	public static Jalebi getJalebi() {
		return jalebi;
	}
}

public class SingletonPattern2 {

	public static void main(String[] args) {
		System.out.println(Jalebi.getJalebi().hashCode());
		System.out.println(Jalebi.getJalebi().hashCode());
	}
}
