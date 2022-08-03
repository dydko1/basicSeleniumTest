package pl.sii.designPatterns.abstractFactory.abs3.factory;

import pl.sii.designPatterns.abstractFactory.abs3.fatory.AbstractFactory3;
import pl.sii.designPatterns.abstractFactory.abs3.fatory.RoundedShapeFactory3;
import pl.sii.designPatterns.abstractFactory.abs3.fatory.SimpleShapeFactory3;
import pl.sii.designPatterns.abstractFactory.abs3.model.Shape3;

public class FactoryProducer {
    public static AbstractFactory3 getFactory(boolean isRounded) {
        if (isRounded)
            return new RoundedShapeFactory3();
        else
            return new SimpleShapeFactory3();
    }
}
