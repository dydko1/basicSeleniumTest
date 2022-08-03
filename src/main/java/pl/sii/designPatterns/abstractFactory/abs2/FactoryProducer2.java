package pl.sii.designPatterns.abstractFactory.abs2;

public class FactoryProducer2 {
    public static AbstractFactory2 getFactory(boolean isRounded) {

        if (isRounded)
            return new RoundedShapeFactory2();
        else
            return new NormalShapeFactory2();
    }
}
