package pl.sii.excersise.fact;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(10));
    }

    private static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return fact(n - 1) * n;
    }
}
