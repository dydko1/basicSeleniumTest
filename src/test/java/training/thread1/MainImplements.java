package training.thread1;

public class MainImplements implements Runnable {
    public static void main(String[] args) {
        MainImplements mainImplements = new MainImplements();
        Thread thread = new Thread(mainImplements);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("In run");
    }
}
