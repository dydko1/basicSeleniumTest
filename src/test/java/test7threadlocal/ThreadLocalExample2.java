package test7threadlocal;

public class ThreadLocalExample2 {
    private static final ThreadLocal<Integer> userId = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            Integer id = (int) (Math.random() * 1000);
            userId.set(id);
            simulateTest();
            //userId.remove();
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task, "Test-" + i).start();
        }
    }

    private static void simulateTest() {
        System.out.println(Thread.currentThread().getName()
                + " running with userId=" + userId.get());
    }
}
