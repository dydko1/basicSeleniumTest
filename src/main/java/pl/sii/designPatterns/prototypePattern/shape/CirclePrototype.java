package pl.sii.designPatterns.prototypePattern.shape;

public class CirclePrototype extends ShapePrototype {

    public CirclePrototype() {
        type = "CirclePat";
    }

    @Override
    void draw() {
        System.out.println("Inside CirclePrototype::draw() method.");
    }
}
