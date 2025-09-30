package test6.function1.generic1;

public class Main12 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("hello Miro");
        System.out.println(stringBox.get());

        Box<Integer> integerBox=new Box<>();
        integerBox.set(50);
        System.out.println(integerBox.get());
    }
}
