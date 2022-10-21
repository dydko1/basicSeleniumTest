package w3schools.refe.a;

public class MethodReference2 {

    public void satHello() {
        System.out.println("Hello World!!!");
    }

    public static void main(String[] args) {
        MethodReference2 methodReference2 = new MethodReference2();
        DisplayInterface2 displayInterface2 = methodReference2::satHello;
        displayInterface2.display();
    }
}
