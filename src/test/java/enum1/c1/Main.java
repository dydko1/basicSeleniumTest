package enum1.c1;

import com.beust.ah.A;

import static enum1.c1.Example.*;

public class Main {
    public static void main(String[] args) {
        Group1 group1 = Group1.A;
        Example example = Enum_A1;
        Group1 group2 = Group1.B;


        //System.out.println(Enum_B1.isInGroup(group1));

        switch (example) {
            case Enum_A1:
                System.out.println("A1");
                System.out.println(Enum_A1.isInGroup(group1));
                break;
            case Enum_A2:
                System.out.println("A2");
                break;
            default:
                System.out.println("dddddddddddddddddd");
        }

    }
}
