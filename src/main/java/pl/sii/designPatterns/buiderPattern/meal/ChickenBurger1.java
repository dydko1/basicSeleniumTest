package pl.sii.designPatterns.buiderPattern.meal;

public class ChickenBurger1 extends Burger1 {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 60.5f;
    }
}
