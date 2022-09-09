package enum1.gg1OK;

import java.util.*;

public class ProductGroups2 {
    //HashSet<AllProducts> AGropus= HashSet.AllProducts.Aset add);
    static EnumSet<AllProducts> enumSetA = EnumSet.of(AllProducts.A1, AllProducts.A2, (AllProducts.A3));
    static EnumSet<AllProducts> enumSetB = EnumSet.of(AllProducts.B1, AllProducts.B2, (AllProducts.B3));
    static EnumSet<AllProducts> enumSetC = EnumSet.of(AllProducts.C1, AllProducts.C2, (AllProducts.C3));

    public static void printAll() {
        for (AllProducts a : enumSetA) {
            System.out.println(a.name());
        }
        //List<EnumSet<AllProducts>> l = Arrays.asList(enumSetA);
    }


    // nie ma sensu
    public static void getEle() {
        List<EnumSet>   lists = Arrays.asList(enumSetA, enumSetB, enumSetC);

        for (EnumSet a : lists) {
            System.out.println(a.contains(AllProducts.A1));
        }
    }
    //= EnumSet.of(
}
