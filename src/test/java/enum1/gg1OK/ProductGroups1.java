package enum1.gg1OK;

public enum ProductGroups1 {

    // bez sensu
    AA1(AllProducts.A1), AA2(AllProducts.A2), AA3(AllProducts.A3),
    BB1(AllProducts.B1), BB2(AllProducts.B2), BB3(AllProducts.B3),
    CC1(AllProducts.A1), CC2(AllProducts.C2), CC3(AllProducts.C3); //

    private AllProducts allProducts;



    ProductGroups1(AllProducts allProducts) {
        this.allProducts = allProducts;
    }

    public AllProducts getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(AllProducts allProducts) {
        this.allProducts = allProducts;
    }

    public void test12() {

        //ProductGroups1 p = ProductGroups1.AA1;
        //System.out.println("sdd=" + this.name());

    }


//    public void getAll(){
//        System.out.println(AA[2].name());
//    }

//
//    public AllProducts isInGroup(AllProducts allProducts) {
//                return this.allProducts;
//    }
//
//    public AllProducts getAllProducts() {
//        return allProducts;
//    }
//
//    public void setAllProducts(AllProducts allProducts) {
//        this.allProducts = allProducts;
//    }
//    public void t(ProductGroups productGroups){
//        for (AllProducts a: ProductGroups.class.getSimpleName()
//             ) {
//
//        }
//    }
//    public void cont(){
//        for (:this.getClass()
//             ) {
//
//        }

    //}
}
