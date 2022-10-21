package w3schools.refe.b;

public class MethodReference3 {
    public static void main(String[] args) {
        DisplayInterface3 displayInterface3 = Hello3::new;
        displayInterface3.display3("dddd");
    }
}
