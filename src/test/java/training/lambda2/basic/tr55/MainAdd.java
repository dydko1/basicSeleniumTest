package training.lambda2.basic.tr55;

public class MainAdd {
    public static void main(String[] args) {
        Addable55 addable55 = (a, b) -> {
            return a + b;
        };

        System.out.println(addable55.add(5,10));
    }
}
