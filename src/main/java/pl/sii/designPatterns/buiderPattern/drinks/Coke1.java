package pl.sii.designPatterns.buiderPattern.drinks;

public class Coke1 extends ColdDrink1 {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
