package pl.sii.designPatterns.abstractFactory.abs3;

import pl.sii.designPatterns.abstractFactory.abs3.factory.FactoryProducer;
import pl.sii.designPatterns.abstractFactory.abs3.fatory.AbstractFactory3;
import pl.sii.designPatterns.abstractFactory.abs3.model.Shape3;

public class MainAbstractFactoryDemo3 {
    public static void main(String[] args) {
        AbstractFactory3 abstractFactory3 = FactoryProducer.getFactory(true);

        Shape3 shape = abstractFactory3.getShape("ReCtangle3");
        shape.draw();

        shape = abstractFactory3.getShape("SquaRE3");
        shape.draw();

        abstractFactory3 = FactoryProducer.getFactory(false);

        shape = abstractFactory3.getShape("rectangle3");
        shape.draw();

        shape = abstractFactory3.getShape("sqUARE3");
        shape.draw();
    }
}
