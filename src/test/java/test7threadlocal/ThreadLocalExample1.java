package test7threadlocal;

public class ThreadLocalExample1 {

    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            THREAD_LOCAL.set("Data for " + threadName);
            System.out.println(threadName + " -> " + THREAD_LOCAL.get());
        };

        Thread t1 = new Thread(task, "Thread-AA");
        Thread t2 = new Thread(task, "Thread-BB");
        Thread t3 = new Thread(task, "Thread-CC");
        t1.start();
        t2.start();
        t3.start();
    }
}