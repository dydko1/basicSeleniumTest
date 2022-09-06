package enum1.d1;

import enum1.c1.Group1;

class ProductTypeConfiguration {

    static ProductType[] GROUPS_TYPE_A = {
            ProductType.A1,
            ProductType.A2,
            ProductType.A3
    };

    static ProductType[] GROUPS_TYPE_B = {
            ProductType.B1,
            ProductType.B2,
            ProductType.B3
    };

    static ProductType[] GROUPS_TYPE_C = {
            ProductType.C1,
            ProductType.C2,
            ProductType.C3
    };

    private ProductType productType;

    public ProductTypeConfiguration(ProductType productType) {
        this.productType = productType;
    }

    public boolean isInGroup(ProductType productType) {
        return this.productType == productType;
    }

    public boolean getType(ProductType[] productTypes1) {
        for (ProductType p : productTypes1) {
            System.out.println(p.name());

        }
        return true;
    }

}