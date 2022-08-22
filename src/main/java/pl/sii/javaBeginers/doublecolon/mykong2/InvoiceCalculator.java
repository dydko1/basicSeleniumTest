package pl.sii.javaBeginers.doublecolon.mykong2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InvoiceCalculator {

    public BigDecimal normal(Invoice invoice) {
        return invoice.getUnitPrice().multiply(BigDecimal.valueOf(invoice.qty));
    }

    public BigDecimal promotion(Invoice invoice) {
        return invoice.getUnitPrice().
                multiply(BigDecimal.valueOf(invoice.qty)).
                multiply(BigDecimal.valueOf(0.9)).
                setScale(2, RoundingMode.HALF_UP);
    }
}
