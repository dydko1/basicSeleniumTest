package enum1.d1;

public class MainT {
    public static void main(String[] args) {
       // ProductType productType1 = ProductType.A1;
       // ProductTypeHelper.getProductType(productType1);
        // coś brak mi teraz pomyslu
        ProductTypeConfiguration productTypeConfiguration=new ProductTypeConfiguration(ProductType.A1);
        System.out.println(productTypeConfiguration);
    }
}
