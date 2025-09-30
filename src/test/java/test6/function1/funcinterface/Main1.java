package test6.function1.funcinterface;

public class Main1 {
    public static void main(String[] args) {
        Square s = x -> x * x;

        System.out.println(s.calculate(50));
    }
}
