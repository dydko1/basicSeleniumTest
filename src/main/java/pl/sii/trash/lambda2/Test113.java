package pl.sii.trash.lambda2;

public class Test113 {
    private int operate1(int a, int b, FuncInter12 funcInter12) {
        return funcInter12.operator12(a, b);
    }

    public static void main(String[] args) {
        FuncInter12 add = (x, y) -> x + y;

        FuncInter12 multiply = (x, y) -> x * y;

        Test113 test113 = new Test113();
        System.out.println(test113.operate1(10, 20, add));

        System.out.println(test113.operate1(10, 20, multiply));

        FuncInter13 fMessage = message -> System.out.println("Hello: " + message);

        fMessage.sayMessage("fhsddfjhj");
    }
}
