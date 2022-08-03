package pl.sii.designPatterns.abstractFactory.abs4.factory;

import pl.sii.designPatterns.abstractFactory.abs4.model.Rectangle4;
import pl.sii.designPatterns.abstractFactory.abs4.model.Shape4;
import pl.sii.designPatterns.abstractFactory.abs4.model.Square4;

public class NormalShapeFactory4 extends AbstractFactory4 {

    @Override
    public Shape4 getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle4"))
            return new Rectangle4();
        else if (shapeType.equalsIgnoreCase("Square4"))
            return new Square4();

        return null;
    }
}
