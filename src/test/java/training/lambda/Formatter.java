package training.lambda;

public class Formatter {
    public static void main(String[] args) {

        StringFunction exclaim = s -> s + "!!!!";
        StringFunction ask = s -> s + "???";

        printFormatting("Dobry", exclaim);
        printFormatting("4555", ask);

    }

    public static void printFormatting(String str, StringFunction stringFunction) {
        String result = stringFunction.run(str);
        System.out.println("=" + result);
    }
}
