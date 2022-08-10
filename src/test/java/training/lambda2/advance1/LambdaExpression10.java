package training.lambda2.advance1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpression10 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product(1, "CApple", 2.0f),
                new Product(2, "ABannana", 3f),
                new Product(3, "BANut", 4f));

        System.out.println("Products are sorting ...");

        Collections.sort(products, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        products.forEach(n->{
            System.out.println("Product is: "+ n.name);
        });

    }
}
