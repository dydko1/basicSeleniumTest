package enum1.g1;

public enum SubGroup2 {

    ACCOUNT1(TopGroup.ACCOUNTS), ACCOUNT2(TopGroup.ACCOUNTS), ACCOUNT3(TopGroup.ACCOUNTS),
    CARD1(TopGroup.CARDS), CARD2(TopGroup.CARDS), CARD3(TopGroup.CARDS),
    SAVINGS1(TopGroup.SAVINGS), SAVINGS2(TopGroup.SAVINGS), SAVINGS3(TopGroup.SAVINGS);

    // -----------------

    private TopGroup baseGroup;

    SubGroup2(TopGroup baseGroup) {
        this.baseGroup = baseGroup;
    }

    public TopGroup getBaseGroup() {
        return baseGroup;
    }

    public void setBaseGroup(TopGroup baseGroup) {
        this.baseGroup = baseGroup;
    }

    public  boolean isInGroup(TopGroup baseGroup){
        return this.baseGroup==baseGroup;
    }


}
