package pl.sii.designPatterns.facadePattern;

public class ShapeMaker {
    private Shape123 circle;
    private Shape123 rectangle;
    private Shape123 square;

    public ShapeMaker() {
        circle = new Circle123();
        rectangle = new Rectangle123();
        square = new Square123();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
