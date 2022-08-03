package pl.sii.designPatterns.abstractFactory.abs2;

import pl.sii.designPatterns.abstractFactory.abs2.model1.Rectangle2Rounded;
import pl.sii.designPatterns.abstractFactory.abs2.model1.Shape2;
import pl.sii.designPatterns.abstractFactory.abs2.model1.SquareRounded2;

public class RoundedShapeFactory2 extends AbstractFactory2 {
    @Override
    Shape2 getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE2"))
            return new Rectangle2Rounded();
        else if (shapeType.equalsIgnoreCase("SQUARE2"))
            return new SquareRounded2();
        return null;
    }
}
