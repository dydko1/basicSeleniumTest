package pl.sii.javalambda.lambdaSyntax.b;

import java.util.function.BiFunction;

public class Util04 extends ParentUtil04 {
    public Util04() {
        BiFunction<String, String, String> strFunc = this::append04;
        String name = "java2s.com";
        String s = strFunc.apply(name, "XXddd");
        System.out.println(s);

        strFunc = Util04.super::append04;
        name = "Miro2222";
        s = strFunc.apply(name, "KKKKKKKKKKKKKKKKKKKK");
        System.out.println(s);
    }

    @Override
    public String append04(String s1, String s2) {
        System.out.println("Child append04");
        return s1 + s2;
    }
}
