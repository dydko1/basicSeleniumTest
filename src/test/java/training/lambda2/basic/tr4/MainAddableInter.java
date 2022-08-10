package training.lambda2.basic.tr4;

public class MainAddableInter {
    public static void main(String[] args) {
        Addable1 add1 = (a, b) -> {
            return (a + b);
        };

        System.out.println("Dodawanko " + add1.add(10,20));
    }
}
