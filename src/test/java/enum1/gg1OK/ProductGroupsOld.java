package enum1.gg1OK;

public class ProductGroupsOld {


    static AllProducts[] AA = {AllProducts.A1, AllProducts.A2, AllProducts.A3};
    static AllProducts[] BB = {AllProducts.B1, AllProducts.B2, AllProducts.B3};
    static AllProducts[] CC = {AllProducts.C1, AllProducts.C2, AllProducts.C3};
    private AllProducts allProducts;

    public ProductGroupsOld(AllProducts allProducts) {

        this.allProducts = allProducts;
    }

    public void getAll(){
        System.out.println(AA[2].name());
    }

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
