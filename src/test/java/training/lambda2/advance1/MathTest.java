package training.lambda2.advance1;

public class MathTest {
    public static void printResult(int x) {
        System.out.println("Wynik: " + x);
    }

    public static void main(String[] args) {
        MathOp add = (a, b) -> {
            return a + b;
        };

        printResult(add.operator(5,6));


    }
}
