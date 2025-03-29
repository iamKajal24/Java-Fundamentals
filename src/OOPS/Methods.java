package OOPS;

class Computer {
	public void playMusic() {
		System.out.println("Music playing...");
	}

	public String getMePan(int cost) {
		if (cost >= 10)
			return "pen";
		else {
			return "Nothing";
		}
	}
}

public class Methods {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.playMusic();
		String res = com.getMePan(12);
		System.out.println(res);

	}

}
