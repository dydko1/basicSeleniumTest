package pl.sii.trash.lambda2;

import pl.sii.excersise.sorting.SortArrayExample1;

public class LambdaHelloTest {
    public static void main(String[] args) {
        Hello hello = h -> "Welcome: " + h + ":ee";

        printTest("abc", hello);
        //System.out.println(hello.sayHello("ddddd"));
    }

    static void printTest(String s, Hello hello) {
        System.out.println(hello.sayHello(s));
    }
}
