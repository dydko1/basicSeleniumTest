package pl.sii.designPatterns.singleton;

public class SinglePatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage("abc");
        singleObject.showMessage("CVV");
        singleObject.showMessage("d");
        singleObject.showMessage("fgg");

        SingleObject singleObject1 = SingleObject.getInstance();
        singleObject1.showMessage("koniec");
    }
}
