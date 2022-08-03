package pl.sii.designPatterns.abstractFactory.abs4.factory;

import pl.sii.designPatterns.abstractFactory.abs4.model.Shape4;

public abstract class AbstractFactory4 {
    public abstract Shape4 getShape(String shapeType);

    public Integer countField() {
        return null;
    }
}
