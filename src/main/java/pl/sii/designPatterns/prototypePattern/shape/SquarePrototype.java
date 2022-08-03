package pl.sii.designPatterns.prototypePattern.shape;

public class SquarePrototype extends ShapePrototype {

    public SquarePrototype() {
        type = "SquarePro";
    }

    @Override
    void draw() {
        System.out.println("Inside SquarePrototype::draw method.");
    }
}
