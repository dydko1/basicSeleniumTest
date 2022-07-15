package training.constructors;

public class BaseBB extends BaseAA {
    String string;
    public BaseBB(String string) {
        this.string = string;
    }
    public BaseBB() {
        super();
        System.out.println("BB constructor");
    }
}
