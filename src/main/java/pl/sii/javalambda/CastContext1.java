package pl.sii.javalambda;

public class CastContext1 {
    public static void main(String[] args) {
        engine((LongCalculator1) (x, y) -> (x + y));
    }

    private static void engine(IntCalculator1 intCalculator1) {
        int x = 2, y = 5;
        System.out.println(intCalculator1.calculate(x, y));
    }

    private static void engine(LongCalculator1 longCalculator1) {
        long x = 50, y = 60;
        System.out.println(longCalculator1.calculate(x, y));
    }
}

@FunctionalInterface
interface IntCalculator1 {
    int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator1 {
    long calculate(long x, long y);
}
