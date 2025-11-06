package test7threadlocal;

public class ThreadLocalExample3 {
    private static final InheritableThreadLocal<String> context = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        context.set("Parent Value");

        Thread child = new Thread(() -> {
            System.out.println("Child thread got: " + context.get());
        });

        child.start();

        System.out.println(Thread.currentThread().getName() + " original: " + context.get());

    }
}