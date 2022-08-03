package pl.sii.designPatterns.decoratorPattern;

public abstract class ShapeDecorator1234 implements Shape1234 {

    protected Shape1234 decoratorShape;

    public ShapeDecorator1234(Shape1234 decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
