package enum1.g1;

enum Col {
    COL1(Subgroup.SUBGROUP1), COL2(Subgroup.SUBGROUP1), COL3(Subgroup.SUBGROUP2), COL4(Subgroup.SUBGROUP2),
    COL5(Subgroup.SUBGROUP3), COL6(Subgroup.SUBGROUP3), COL7(Subgroup.SUBGROUP4), COL8(Subgroup.SUBGROUP4);

    Subgroup sub;

    private Col(Subgroup sub) {
        this.sub = sub;
    }

    public MainGroup getMainGroup() {
        return sub.getMainGroup();
    }

    public Subgroup getSubgroup() {
        return sub;
    }
}