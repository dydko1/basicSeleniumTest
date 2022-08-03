package pl.sii.designPatterns.buiderPattern.meal;

public class VegBurger1 extends Burger1 {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 50.2f;
    }
}
