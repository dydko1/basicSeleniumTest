package pl.sii.trash.lambda4;

public class Test125 {
    String str;

    public Test125(String str) {
        this.str = str + "abc";
    }

    void someFunction() {
        System.out.println(this.str);
    }
}
