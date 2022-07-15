package training.thread1;

import training.array1.Main;

public class MainAmount1 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        MainAmount1 thread = new MainAmount1();
        MainAmount1 thread2 = new MainAmount1();

        System.out.println(amount);
        thread.start();
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        //thread2.start();

        //System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
