package pl.sii.designPatterns.buiderPattern.drinks;

public class Pepsi1 extends ColdDrink1 {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.1f;
    }
}
