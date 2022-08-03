package pl.sii.designPatterns.singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(String s) {
        System.out.println("Hello World " + s);
    }
}
