package enum1.c1;

public enum Example {
    Enum_A1(Group1.A),
    Enum_A2(Group1.A),
    Enum_A3(Group1.A),

    Enum_B1(Group1.B),
    Enum_B2(Group1.B),
    Enum_B3(Group1.B),

    Enum_C1(Group1.C),
    Enum_C2(Group1.C),
    Enum_C3(Group1.C);

    private Group1 group1;

    public boolean isInGroup(Group1 group1) {
        return this.group1 == group1;
    }

    Example(Group1 group1) {
        this.group1 = group1;
    }
}
