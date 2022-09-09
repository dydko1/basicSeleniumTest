package enum1.gg1OK;

public class MainTest {
    public static void main(String[] args) {
//        AllProducts allProducts = AllProducts.B3;
//
//        ProductGroups1 a = ProductGroups1.AA2;
//        AllProducts aa = AllProducts.A2;
//        System.out.println(a.getAllProducts().equals(aa));

        ProductGroups2.printAll();
        AllProducts myProduct = AllProducts.C2;
        System.out.println(ProductGroups2.enumSetA.contains(AllProducts.A3));

        // tak dziala
        if (ProductGroups2.enumSetA.contains(myProduct)) {
            System.out.println("AAAAAAAAAAAAAA");
        } else if (ProductGroups2.enumSetB.contains(myProduct)) {
            System.out.println("BBBB");
        } else if (ProductGroups2.enumSetC.contains(myProduct)) {
            System.out.println("CCC!!!!");
        } else
            System.out.println("inny");

        System.out.println("-----------------------");



        ProductGroups2.getEle();
        // a.compareTo(ProductGroups1.AA1);
        //System.out.println(a.test12());
//        a.getAll();


        //if (ProductGroups.A.)
    }
}
