package pl.sii.javaBeginers.doublecolon.mykong3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class Java8MethodReference4b {
    public static void main(String[] args) {
        List<BigDecimal> list = Arrays.asList(
                BigDecimal.valueOf(9.99),
                BigDecimal.valueOf(2.99),
                BigDecimal.valueOf(8.99));

        List<Invoice1> invoice1 = fakeInvoice(list, Invoice1::new);
        invoice1.forEach(System.out::println);

    }

    static List<Invoice1> fakeInvoice(List<BigDecimal> list, Function<BigDecimal, Invoice1> func) {
        List<Invoice1> res = new LinkedList<>();

        for (BigDecimal amount : list) {
            res.add(func.apply(amount));
        }
        return res;
    }
}
