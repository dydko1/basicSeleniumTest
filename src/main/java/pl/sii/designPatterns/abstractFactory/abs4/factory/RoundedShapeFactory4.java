package pl.sii.designPatterns.abstractFactory.abs4.factory;

import pl.sii.designPatterns.abstractFactory.abs4.model.Rectangle4Rounded;
import pl.sii.designPatterns.abstractFactory.abs4.model.Shape4;
import pl.sii.designPatterns.abstractFactory.abs4.model.Square4Rounded;

public class RoundedShapeFactory4 extends AbstractFactory4{
    @Override
    public Shape4 getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle4"))
            return new Rectangle4Rounded();
        else if(shapeType.equalsIgnoreCase("Square4"))
            return new Square4Rounded();

        return null;
    }
}
