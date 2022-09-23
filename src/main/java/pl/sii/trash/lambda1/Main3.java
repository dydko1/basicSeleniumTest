package pl.sii.trash.lambda1;

public class Main3 {
    public static void main(String[] args) {
        StringFunc1 que = s -> s + "que??";
        StringFunc1 exc = s -> s + "exl!!";

        printText("abc", que);
        printText("cde", exc);
    }

    static void printText(String s, StringFunc1 stringFunc1) {
        System.out.println(stringFunc1.run1(s));
        System.out.println(stringFunc1.run1("ddddddddddddddddddd"));
    }
}
