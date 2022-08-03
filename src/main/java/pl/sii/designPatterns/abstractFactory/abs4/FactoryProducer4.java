package pl.sii.designPatterns.abstractFactory.abs4;

import pl.sii.designPatterns.abstractFactory.abs4.factory.AbstractFactory4;
import pl.sii.designPatterns.abstractFactory.abs4.factory.NormalShapeFactory4;
import pl.sii.designPatterns.abstractFactory.abs4.factory.RoundedShapeFactory4;

public class FactoryProducer4 {
    public static AbstractFactory4 getShape(boolean isRounded) {
        if (isRounded)
            return new RoundedShapeFactory4();
        else
            return new NormalShapeFactory4();
    }
}
