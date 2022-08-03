package pl.sii.designPatterns.buiderPattern.drinks;

import pl.sii.designPatterns.buiderPattern.interfAbs.Packing1;

public class Bottle1 implements Packing1 {
    @Override
    public String pack() {
        return "Bottle1 is packing.";
    }
}
