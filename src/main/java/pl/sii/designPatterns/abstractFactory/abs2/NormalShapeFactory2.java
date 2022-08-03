package pl.sii.designPatterns.abstractFactory.abs2;

import pl.sii.designPatterns.abstractFactory.abs2.model1.Rectangle2;
import pl.sii.designPatterns.abstractFactory.abs2.model1.Shape2;
import pl.sii.designPatterns.abstractFactory.abs2.model1.Square2;

public class NormalShapeFactory2 extends AbstractFactory2 {
    @Override
    Shape2 getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE2"))
            return new Rectangle2();
        else if (shapeType.equalsIgnoreCase("SQUARE2"))
            return new Square2();
        return null;
    }
}
