package enum1.g1;

enum Subgroup {
    SUBGROUP1(MainGroup.GROUP_MAIN1), SUBGROUP2(MainGroup.GROUP_MAIN1),
    SUBGROUP3(MainGroup.GROUP_MAIN2), SUBGROUP4(MainGroup.GROUP_MAIN2);

    MainGroup main;

    private Subgroup(MainGroup main) {
        this.main = main;
    }

    public MainGroup getMainGroup() {
        return main;
    }

}