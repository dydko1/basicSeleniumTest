package w3schools.default1;

public interface Display {
    default void display() {
        System.out.println("Hello Miro!!");
    }

    void displayMore(String msg);
}
