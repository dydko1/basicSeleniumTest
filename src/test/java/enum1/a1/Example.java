package enum1.a1;

import java.util.EnumSet;

public enum Example {

    ENUM_A1, ENUM_A2, ENUM_A3,
    ENUM_B1, ENUM_B2, ENUM_B3,
    ENUM_C1, ENUM_C2, ENUM_C3;

    public static EnumSet<Example> groupA = EnumSet.of(ENUM_A1, ENUM_A2, ENUM_A3);
    public static EnumSet<Example> groupB = EnumSet.of(ENUM_B1, ENUM_B2, ENUM_B3);
    public static EnumSet<Example> groupC = EnumSet.of(ENUM_C1, ENUM_C2, ENUM_C3);


    public static void main(String[] args){
        if(Example.groupA.contains(Example.ENUM_A1)){
            System.out.println("Group A contains ENUM A1");
        }
        System.out.println(ENUM_A1.name());
    }
}

