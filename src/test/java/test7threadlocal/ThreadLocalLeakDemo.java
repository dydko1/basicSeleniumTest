package test7threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalLeakDemo {
    private static final ThreadLocal<Integer> userId = new ThreadLocal<>();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // tylko 3 wątki w puli

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            Integer id = (int) (Math.random() * 1000);

            // ustaw nową wartość
            userId.set(id);

            // zasymuluj test
            simulateTest(threadName);

            // ❗ Spróbuj raz z remove() i raz bez
             userId.remove();
        };

        for (int i = 0; i < 90; i++) {
            executor.submit(task);
        }

        executor.shutdown();
    }

    private static void simulateTest(String threadName) {
        System.out.println(threadName + " running with userId=" + userId.get());
    }
}
