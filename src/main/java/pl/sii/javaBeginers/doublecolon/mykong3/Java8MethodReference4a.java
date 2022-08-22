package pl.sii.javaBeginers.doublecolon.mykong3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Java8MethodReference4a {
    public static void main(String[] args) {
        Supplier<Map> obj1 = () -> new HashMap();
        Map map1 = obj1.get();

        Supplier<Map> obj2 = HashMap::new;
        Map map2 = obj2.get();

        Supplier<Invoice1> obj3 = () -> new Invoice1();
        Invoice1 inv1 = obj3.get();

        Supplier<Invoice1> obj4 = Invoice1::new;
        Invoice1 inv2 = obj4.get();
    }
}
