package pl.sii.designPatterns.prototypePattern.shape;

public class RectanglePrototype extends ShapePrototype {
    public RectanglePrototype() {
        type = "RectanglePat";
    }

    @Override
    void draw() {
        System.out.println("Inside RectanglePrototype::draw() method.");
    }
}
