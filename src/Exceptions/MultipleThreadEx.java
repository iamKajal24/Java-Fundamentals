package Exceptions;

class Hi extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("hii");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultipleThreadEx {

	public static void main(String[] args) throws InterruptedException {

		Hi obj = new Hi();
		Hello obj1 = new Hello();

		// System.out.println(obj.getPriority());
		// obj.setPriority(Thread.MAX_PRIORITY);

		obj.start();
		Thread.sleep(2);
		obj1.start();

	}

}
