package pl.sii.trash.threating;

public class ManRuna implements Runnable{
    public static void main(String[] args) {
        ManRuna manRuna =new ManRuna();
        Thread thread=new Thread(manRuna);
        thread.start();
        System.out.println("outside");
    }
    @Override
    public void run() {
        System.out.println("This code is running in a thread!!!");
    }
}
