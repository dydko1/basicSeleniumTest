package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class ShapeRoundFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE1"))
            return new RoundedRectangle1();
        else if (shapeType.equalsIgnoreCase("SQUARE1"))
            return new RoundedSquare1();

        return null;
    }
}
