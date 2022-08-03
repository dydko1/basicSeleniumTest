package pl.sii.designPatterns.prototypePattern;

import pl.sii.designPatterns.prototypePattern.shape.ShapePrototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache1.loadCache();

        ShapePrototype clonedShape1 = (ShapePrototype) ShapeCache1.getShape("3");
        System.out.println("Shape: " + clonedShape1.getType());


        ShapePrototype clonedShape2 = (ShapePrototype) ShapeCache1.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        ShapePrototype clonedShape3 = (ShapePrototype) ShapeCache1.getShape("1");
        System.out.println("Shape: " + clonedShape3.getType());

    }
}
