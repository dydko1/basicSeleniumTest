package test7threadlocal;

public class WithoutThreadLocal {
    private static String sharedValue;

    public static void main(String[] args) {

        Runnable task = () -> {
            sharedValue = Thread.currentThread().getName();
            System.out.println(Thread.currentThread().getName() + " sees: " + sharedValue);
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task, "T" + i).start();
        }
    }
}
