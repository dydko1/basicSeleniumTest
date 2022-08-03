package pl.sii.designPatterns.abstractFactory.abs1;

import pl.sii.designPatterns.factoryPattern.Shape;

public class RoundedSquare1 implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare1::draw() method.");
    }
}
