package w3schools.default1;

public class DefaultsMethods implements Display {

    public static void main(String[] args) {

        DefaultsMethods defaultsMethods = new DefaultsMethods();
        defaultsMethods.display();
        defaultsMethods.displayMore("Mirorrrrrrrrrrrrrrrrrrr");
    }

    @Override
    public void displayMore(String msg) {
        System.out.println("Tu był Miro222 " + msg);
    }
}
