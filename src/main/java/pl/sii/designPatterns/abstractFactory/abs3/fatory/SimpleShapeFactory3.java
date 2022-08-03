package pl.sii.designPatterns.abstractFactory.abs3.fatory;

import pl.sii.designPatterns.abstractFactory.abs3.model.Rectangle3;
import pl.sii.designPatterns.abstractFactory.abs3.model.Shape3;
import pl.sii.designPatterns.abstractFactory.abs3.model.Square3;

public class SimpleShapeFactory3 extends AbstractFactory3 {
    @Override
    public Shape3 getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle3"))
            return new Rectangle3();
        else if (shapeType.equalsIgnoreCase("Square3"))
            return new Square3();

        return null;
    }
}
