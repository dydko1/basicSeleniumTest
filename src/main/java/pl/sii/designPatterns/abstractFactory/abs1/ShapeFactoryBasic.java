package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class ShapeFactoryBasic extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE1"))
            return new Rectangle1();
        else if (shapeType.equalsIgnoreCase("SQUARE1"))
            return new Square1();

        return null;
    }
}
