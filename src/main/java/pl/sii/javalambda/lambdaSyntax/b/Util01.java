package pl.sii.javalambda.lambdaSyntax.b;

public class Util01 {
    private int count = 0;

    public void print01(String s) {
        System.out.println("Method print01. Count is:\t" + s);
        count++;
    }

    public void debug01() {
        System.out.println("Method debug01. Count is:\t" + count);
    }
}
