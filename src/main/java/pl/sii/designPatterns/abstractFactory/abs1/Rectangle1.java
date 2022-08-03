package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class Rectangle1 implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle1::draw() method.");
    }
}
