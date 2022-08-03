package pl.sii.designPatterns.decoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape1234 circle = new Circle1234();

        Shape1234 redCircle = new RedShapeDecorator(new Circle1234());
        Shape1234 redRectangle = new RedShapeDecorator(new Rectangle1234());

        System.out.println("Normal circle");
        circle.draw();
        System.out.println("Figure has red frame");
        redCircle.draw();
        redRectangle.draw();


    }
}
