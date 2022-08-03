package pl.sii.designPatterns.decoratorPattern;

public class RedShapeDecorator extends ShapeDecorator1234 {

    public RedShapeDecorator(Shape1234 decShape) {
        super(decShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape1234 abc) {
        System.out.println("Border is red.");
    }
}
