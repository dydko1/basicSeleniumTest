package training.lambda2.advance1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProductExpression112 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Apples1", 3f),
                new Product(2, "Bannas2", 5f),
                new Product(3, "Nuts3", 4f),
                new Product(4, "Strawberry", 6f),
                new Product(4, "Blackberry", 7f),
                new Product(4, "Blackberry", 7f));

        Stream<Product> productStream;
        productStream = products.stream().filter(p -> {
            return p.name.contains("Appl");
        });
        productStream.forEach(p ->
                {
                    System.out.println(p.name);
                }
        );
    }
}
