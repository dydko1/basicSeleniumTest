package test4;

public class BusinessClass {
    public String concat(String... words) {
        return String.join(" ", words);
    }

    public void run() {
        System.out.println("Starting....");
    }

    public void stop() {
        System.out.println("Stopping....");
    }

}