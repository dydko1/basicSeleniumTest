package enum1.f1;

public class MainClass {
    public static void main(String[] args) {
        //Col ee = Col.COL1.getMainGroup().compareTo(MainGroup.GROUP_MAIN1);
        MainGroup mainGroup = MainGroup.GROUP_MAIN1;
        Subgroup subgroup = Subgroup.SUBGROUP4;
        Col col = Col.COL1;
        //System.out.println(mainGroup.toString());
        System.out.println(subgroup.getMainGroup());
        System.out.println("================");
        System.out.println(col.getSubgroup());
        System.out.println(col.getMainGroup());
    }
}
