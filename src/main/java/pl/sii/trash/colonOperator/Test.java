package pl.sii.trash.colonOperator;

import java.text.Format;

public class Test {
    String s1;

    public Test(String s1) {
        this.s1 = s1;
    }

    public void someFunction1() {
        System.out.println(String.format("Miro %1$s %2$s", s1,"fffff"));
    }
}
