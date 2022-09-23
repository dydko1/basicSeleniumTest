package pl.sii.trash.threating;

public class MainRuna1 {
    public static void main(String[] args) {

        System.out.println("Before lambda declaration");

        Runnable runnable = () -> staticMethod();
        runnable.run();

        System.out.println("After lambda declaration");

        new Thread(runnable).run();
    }

    private static void staticMethod() {
        System.out.println("I'm in static method.");
    }
}
