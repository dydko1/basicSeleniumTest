package pl.sii.javaBeginers.doublecolon.mykong2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiFunction;

public class Java8MethodReference3b {
    public static void main(String[] args) {
        Invoice obj = new Invoice("A001", BigDecimal.valueOf(1.99), 3);

        InvoiceCalculator formula = new InvoiceCalculator();

        BigDecimal res1 = CalcProvider.calculate(formula, obj, (f, o) -> f.normal(o));
        System.out.println(res1);

        BigDecimal res2 = CalcProvider.calculate(formula, obj, InvoiceCalculator::normal);
        System.out.println(res2);

        BigDecimal res3=CalcProvider.calculate(formula,obj,(f,oo)->f.promotion(oo));
        System.out.println(res3);

        BigDecimal res4=CalcProvider.calculate(formula,obj,InvoiceCalculator::promotion);
        System.out.println(res4);
    }
}
