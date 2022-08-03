package pl.sii.designPatterns.prototypePattern;

import pl.sii.designPatterns.prototypePattern.shape.CirclePrototype;
import pl.sii.designPatterns.prototypePattern.shape.RectanglePrototype;
import pl.sii.designPatterns.prototypePattern.shape.ShapePrototype;
import pl.sii.designPatterns.prototypePattern.shape.SquarePrototype;

import java.util.Hashtable;

public class ShapeCache1 {
    private static Hashtable<String, ShapePrototype> shapeMap = new Hashtable<String, ShapePrototype>();

    public static ShapePrototype getShape(String shapeId) {
        ShapePrototype shapePrototype = shapeMap.get(shapeId);
        return (ShapePrototype) shapePrototype.clone();
    }

    public static void loadCache() {
        CirclePrototype circlePrototype = new CirclePrototype();
        circlePrototype.setId("1");
        shapeMap.put(circlePrototype.getId(), circlePrototype);

        SquarePrototype squarePrototype = new SquarePrototype();
        squarePrototype.setId("2");
        shapeMap.put(squarePrototype.getId(), squarePrototype);

        RectanglePrototype rectanglePrototype = new RectanglePrototype();
        rectanglePrototype.setId("3");
        shapeMap.put(rectanglePrototype.getId(), rectanglePrototype);

    }
}
