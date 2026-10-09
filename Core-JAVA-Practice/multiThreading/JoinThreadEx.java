package multiThreading;

public class JoinThreadEx {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");

        Thread t1 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }

            System.out.println("Thread-0 starts");
        });

        t1.start();

        //t1.join();
        t1.join(1000);

        System.out.println("Main thred ends");
    }

}
