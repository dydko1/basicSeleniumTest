package pl.sii.javaBeginers.doublecolon.mykong2;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class CalcProvider {
    static BigDecimal calculate(InvoiceCalculator calculator, Invoice s1, BiFunction<InvoiceCalculator, Invoice, BigDecimal> func) {
        return func.apply(calculator, s1);
    }
}
