package pl.sii.designPatterns.decoratorPattern;

public class Circle1234 implements Shape1234 {
    @Override
    public void draw() {
        System.out.println("Message is from " + getClass().getSimpleName());
    }
}
