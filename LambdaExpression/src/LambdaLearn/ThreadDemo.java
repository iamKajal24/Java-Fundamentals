package LambdaLearn;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		//first Thread : Thread -JOHN
		
		Runnable thread1 = () ->{
			//this is body of the thread
			for(int i =1;i<=10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		};
		
		Thread t = new Thread(thread1);
		t.setName("JOHN");
		t.start();
		
		Runnable thread2 = ()->{
			
			for(int i =1;i<=10;i++) {
				System.out.println(i*2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		};
		Thread t2 = new Thread(thread2);
		t2.start();
	}

}
