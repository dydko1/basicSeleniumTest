package pl.sii.advanceCourse.enum1;

public enum Color {
    RED("red1"), GREEN("green1"), BLUE("blue3");

    private String val1;

    Color(String val1) {
        this.val1 = val1;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }
}
