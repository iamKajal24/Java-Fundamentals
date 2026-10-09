package multiThreading;

public class PriorityThreadEx {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Custom thread running");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Custom-2 thread running");
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();

        System.out.println("Priority of t1: " + t1.getPriority());
    }
}

/*
 * Thread Priority
 * MAX_PRIORITY = 10
 * MIN_PRIORITY = 1
 * NORM_PRIORITY = 5
 *
 * Depends on OS
 * -> may respect Priority
 * -> may partially respect
 * -> may not at all
 */
