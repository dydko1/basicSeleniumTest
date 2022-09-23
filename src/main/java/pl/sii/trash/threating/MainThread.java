package pl.sii.trash.threating;

public class MainThread extends Thread {
    public static void main(String[] args) {
        MainThread main = new MainThread();
        main.start();
        System.out.println("code is outside!!");
    }

    @Override
    public void run() {
        System.out.println("This code is running in thread.");
    }
}
