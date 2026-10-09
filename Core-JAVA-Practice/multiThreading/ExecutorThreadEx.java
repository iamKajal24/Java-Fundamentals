package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThreadEx {

    public static void main(String args[]) {
        // xecutor framework

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // numbers of tast 5

        for (int i = 1; i <= 5; i++) {

            int taskId = i;
            executorService.execute(() -> {
                System.out.println("Task " + taskId + " is performed by" +
                        Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }

}
