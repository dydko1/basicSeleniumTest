package w3schools.default1;

public interface Interface2 {
    default void display2() {
        System.out.println("Default method Miro1");
    }

    void displayMore2(String msg);

    static void show2(String msg) {
        System.out.println(msg);
    }
}
