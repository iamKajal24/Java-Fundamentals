package multiThreading;

public class Demo1 {

    public static void main(String args[]) {
      
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }

}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

