package pl.sii.designPatterns.abstractFactory.abs1;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isRounded) {
        if (isRounded)
            return new ShapeRoundFactory();
        else
            return new ShapeFactoryBasic();
    }
}
