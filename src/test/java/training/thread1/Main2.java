package training.thread1;

public class Main2 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main2 thread = new Main2();
        thread.start();
        // Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }
}