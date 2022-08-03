package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class AbstractShapeFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factoryProducer = FactoryProducer.getFactory(false);

        Shape shape1 = factoryProducer.getShape("RECTANGLE1");
        shape1.draw();

        Shape shape2 = factoryProducer.getShape("SQUARE1");
        shape2.draw();

        // ----------
        factoryProducer = FactoryProducer.getFactory(true);
        Shape shape3 = factoryProducer.getShape("RECTANGLE1");
        shape3.draw();

        Shape shape4 = factoryProducer.getShape("SQUARE1");
        shape4.draw();

    }
}
