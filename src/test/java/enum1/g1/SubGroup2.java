package enum1.g1;

import enum1.c1Ten.Group1;

public enum SubGroup2 {

    ACCOUNT1(BaseGroup.ACCOUNTS), ACCOUNT2(BaseGroup.ACCOUNTS), ACCOUNT3(BaseGroup.ACCOUNTS),
    CARD1(BaseGroup.CARDS), CARD2(BaseGroup.CARDS), CARD3(BaseGroup.CARDS),
    SAVINGS1(BaseGroup.SAVINGS), SAVINGS2(BaseGroup.SAVINGS), SAVINGS3(BaseGroup.SAVINGS);

    // -----------------

    private BaseGroup baseGroup;

    SubGroup2(BaseGroup baseGroup) {
        this.baseGroup = baseGroup;
    }

    public BaseGroup getBaseGroup() {
        return baseGroup;
    }

    public void setBaseGroup(BaseGroup baseGroup) {
        this.baseGroup = baseGroup;
    }

    public  boolean isInGroup(BaseGroup baseGroup){
        return this.baseGroup==baseGroup;
    }


}
