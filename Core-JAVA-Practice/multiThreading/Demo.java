package multiThreading;

public class Demo {

    public static void main(String args[]) {
        // Threads
        MyThread t = new MyThread();
        t.start();
    }

}

// Thread class Extend
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
/*
 * t1.start() --> JVM asks OS to create a new thread --> Thread gets Stack/PC
 * space -->
 * Thread execute run()
 * 
 */