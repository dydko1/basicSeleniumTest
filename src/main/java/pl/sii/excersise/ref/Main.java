package pl.sii.excersise.ref;

public class Main {

    public static void main(String args[]) {
        Punkt punkt = new Punkt();
        punkt.x = 5;
        punkt.y = 5;

        Test.zmien(punkt);

        System.out.println("Współrzędne to: " + punkt.x + " " + punkt.y);
    }
}