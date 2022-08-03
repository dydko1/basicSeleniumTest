package pl.sii.designPatterns.buiderPattern.meal;

import pl.sii.designPatterns.buiderPattern.interfAbs.Item1;
import pl.sii.designPatterns.buiderPattern.interfAbs.Packing1;
import pl.sii.designPatterns.buiderPattern.meal.Wrapper1;

public abstract class Burger1 implements Item1 {
    @Override
    public Packing1 packing() {
        return new Wrapper1();
    }

    @Override
    public abstract float price();
}
