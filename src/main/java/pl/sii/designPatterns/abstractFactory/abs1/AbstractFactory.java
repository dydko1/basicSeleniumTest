package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
