package enum1.d1;

public class ProductTypeHelper {
    public static ProductType getProductType(ProductType productType) {

        ProductTypeConfiguration productTypeConfiguration = new ProductTypeConfiguration(productType);
        //System.out.println(ProductTypeConfiguration.isInGroup(productType));

        if (productTypeConfiguration.isInGroup(ProductType.A1)) {
            System.out.println("Jeden");
            return ProductType.A1;
        } else {
            System.out.println("Dwa");
            System.out.println(productTypeConfiguration.isInGroup(ProductType.A2));
            return ProductType.A2;
        }
    }
}
