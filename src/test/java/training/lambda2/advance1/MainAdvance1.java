package training.lambda2.advance1;

public class MainAdvance1 {
    public static void main(String[] args) {
        Print myNestedPriner = new Print() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        Print myPrint2 = x -> System.out.println(x);

        myNestedPriner.print("dddoddododod");
        myPrint2.print("fffffffffffff");
    }
}
