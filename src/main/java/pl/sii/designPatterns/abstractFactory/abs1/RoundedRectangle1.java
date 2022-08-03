package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class RoundedRectangle1 implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle1::draw() method.");
    }
}
