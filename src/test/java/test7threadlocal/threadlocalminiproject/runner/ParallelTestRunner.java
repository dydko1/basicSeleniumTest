package test7threadlocal.threadlocalminiproject.runner;
import test7threadlocal.threadlocalminiproject.context.ContextManager;
import test7threadlocal.threadlocalminiproject.context.TestContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ParallelTestRunner {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int index = i;
            executor.submit(() -> {
                TestContext context = new TestContext(
                        "user-" + index,
                        index % 2 == 0 ? "chrome" : "firefox",
                        "env-" + (index % 3)
                );

                ContextManager.setContext(context);

                simulateTest("TestCase-" + index);

                ContextManager.removeContext(); // czyszczenie po teście
            });
        }

        executor.shutdown();
    }

    private static void simulateTest(String name) {
        System.out.println(Thread.currentThread().getName() +
                " running " + name +
                " with " + ContextManager.getContext());
    }
}