package pl.sii.designPatterns.buiderPattern.meal;

import pl.sii.designPatterns.buiderPattern.interfAbs.Packing1;

public class Wrapper1 implements Packing1 {
    @Override
    public String pack() {
        return "Wrapper1 is packing.";
    }
}
