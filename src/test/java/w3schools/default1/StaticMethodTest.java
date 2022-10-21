package w3schools.default1;

public class StaticMethodTest implements Interface2 {
    @Override
    public void displayMore2(String msg) {
        System.out.println("eeee"+msg);
    }

    public static void main(String[] args) {
        StaticMethodTest staticMethodTest = new StaticMethodTest();
        staticMethodTest.display2();
        staticMethodTest.displayMore2("eeeeeee");
        Interface2.show2("ddddddddddd");
    }
}
