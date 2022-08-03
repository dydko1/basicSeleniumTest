package pl.sii.designPatterns.abstractFactory.abs4;

import pl.sii.designPatterns.abstractFactory.abs3.factory.FactoryProducer;
import pl.sii.designPatterns.abstractFactory.abs4.factory.AbstractFactory4;
import pl.sii.designPatterns.abstractFactory.abs4.factory.NormalShapeFactory4;
import pl.sii.designPatterns.abstractFactory.abs4.model.Shape4;
import pl.sii.designPatterns.factoryPattern.Shape;

public class AbstractFactoryDemoMain {
    public static void main(String[] args) {
        AbstractFactory4 abstractFactory4 = FactoryProducer4.getShape(true);
        Shape4 shape4 = abstractFactory4.getShape("ReCtangle4");
        shape4.draw4();
        shape4 = abstractFactory4.getShape("Square4");
        shape4.draw4();
        // -----------
        abstractFactory4 = FactoryProducer4.getShape(false);
        shape4=abstractFactory4.getShape("reCTANGLe4");
        shape4.draw4();
        shape4=abstractFactory4.getShape("square4");
        shape4.draw4();

    }
}
