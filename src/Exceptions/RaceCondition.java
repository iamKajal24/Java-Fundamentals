package Exceptions;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();
		Runnable ob = () -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		};
		Runnable obj = () -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		};

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(c.count);
	}
}
