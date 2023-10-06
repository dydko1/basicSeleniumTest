package pl.sii.javalambda.lambdaSyntax.a;

public class Lambda_Behaviour {
    public static void main(String[] args) {

        IntCalculator intCalculator = (int x, int y) -> x * y;
        engine(intCalculator);
        engine((long x, long y) -> x + y);
        engine((int x, int y) -> x + y);
    }

    private static void engine(LongCalculator calculator) {
        long x = 2;
        long y = 10;

        long result = calculator.calculate(x, y);
        System.out.println(result);
    }

    private static void engine(IntCalculator calculator) {
        int x = 21;
        int y = 10;

        long result = calculator.calculate(x, y);
        System.out.println(result);
    }
}


@FunctionalInterface
interface IntCalculator {
    int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator {
    long calculate(long x, long y);
}