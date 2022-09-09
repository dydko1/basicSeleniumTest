package enum1.g1;

public class MainTest1 {
    public static void main(String[] args) {
        //SubGroup2 subGroup2 = SubGroup2.ACCOUNT2;
        TopGroup baseGroup = SubGroup2.CARD3.getBaseGroup();
        SubGroup2 subGroup2 = SubGroup2.ACCOUNT1;

        switch (baseGroup) {
            case ACCOUNTS:
                System.out.println("accounts!!!!!!");
                System.out.println(baseGroup.name());
                System.out.println(baseGroup.toString());
                break;
            case CARDS:
                System.out.println("cards!!!!!!");
                System.out.println(baseGroup.name());
                System.out.println(baseGroup.toString());
                break;
            case SAVINGS:
                System.out.println("savings!!!!!!");
                System.out.println(baseGroup.name());
                System.out.println(baseGroup.toString());
                break;
            default:
                System.out.println("defaulttttttttt");
        }

//        switch (subGroup2) {
//            case SubGroup2.:
//                System.out.println("ddddd");
//                break;
//            default:
//                System.out.println("ddddddddddddd");

//        }
    }
}
