package pl.sii.javaBeginers.doublecolon.mykong;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8MethodReference1a {
    public static void main(String[] args) {
        List<String > list= Arrays.asList("A","B","C","D");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                SimplePrinter.print(s);
            }
        });
        System.out.println("--------------");
        list.forEach(x->SimplePrinter.print(x));
        System.out.println("--------------");
        list.forEach(SimplePrinter::print);
    }
}
