package Exceptions;

//class Hii implements Runnable {
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("hii");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

class Helloo implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableVsThread {

	public static void main(String[] args) throws InterruptedException {
		// using lambda expression
		Runnable ob = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("hii");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable obj = new Helloo();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();
	}

}
