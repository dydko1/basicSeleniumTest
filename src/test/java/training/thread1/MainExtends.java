package training.thread1;

public class MainExtends extends Thread {
    public static void main(String[] args) {
        MainExtends thread1 = new MainExtends();
        thread1.start();
        //thread1.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}