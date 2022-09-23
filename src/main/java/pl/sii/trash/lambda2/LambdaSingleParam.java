package pl.sii.trash.lambda2;

public class LambdaSingleParam {
    public static void main(String[] args) {
        MyFunctionalInterface1 incrementBy5 = f -> f + 5;

        System.out.println(incrementBy5.incrementByFive(5));
    }
}
