package pl.sii.designPatterns.abstractFactory.abs2;

import pl.sii.designPatterns.abstractFactory.abs2.model1.Shape2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory2 shapeFactory = FactoryProducer2.getFactory(true);
        Shape2 shape11 = shapeFactory.getShape("RECTANGLE2");
        shape11.draw();
        shape11 = shapeFactory.getShape("SQUARE2");
        shape11.draw();
        // ---
        shapeFactory = FactoryProducer2.getFactory(false);
        shape11 = shapeFactory.getShape("RECTANGLE2");
        shape11.draw();
        shape11 = shapeFactory.getShape("SQUARE2");
        shape11.draw();
    }
}
