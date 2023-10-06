package pl.sii.javalambda.lambdaSyntax.a;

public class Introduce {
    public static void main(String[] args) {
        engine((x, y) -> x + y);
    }

    private static void engine(Calculator c) {
        int x = 5, y = 10;
        int result = c.calculate(x, y);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}