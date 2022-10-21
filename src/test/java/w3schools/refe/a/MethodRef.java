package w3schools.refe.a;

public class MethodRef {
    public static void threadStatus() {
        System.out.println("Thread is running...!");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(MethodRef::threadStatus);
        t2.start();
    }
}
