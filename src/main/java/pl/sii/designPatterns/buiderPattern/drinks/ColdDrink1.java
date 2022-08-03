package pl.sii.designPatterns.buiderPattern.drinks;

import pl.sii.designPatterns.buiderPattern.drinks.Bottle1;
import pl.sii.designPatterns.buiderPattern.interfAbs.Item1;
import pl.sii.designPatterns.buiderPattern.interfAbs.Packing1;

public abstract class ColdDrink1 implements Item1 {
    @Override
    public Packing1 packing() {
        return new Bottle1();
    }

    @Override
    public abstract float price() ;
}
