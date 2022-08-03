package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class Square1 implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square1::method() method.");
    }
}
