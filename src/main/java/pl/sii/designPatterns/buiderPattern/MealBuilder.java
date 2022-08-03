package pl.sii.designPatterns.buiderPattern;

import pl.sii.designPatterns.buiderPattern.drinks.Coke1;
import pl.sii.designPatterns.buiderPattern.drinks.Pepsi1;
import pl.sii.designPatterns.buiderPattern.meal.ChickenBurger1;

public class MealBuilder {

    public Meal1 prepareVegMeal() {
        Meal1 meal1 = new Meal1();
        meal1.addItem(new ChickenBurger1());
        meal1.addItem(new Pepsi1());

        return meal1;
    }

    public Meal1 prepareNonVegMeal() {
        Meal1 meal1 = new Meal1();
        meal1.addItem(new ChickenBurger1());
        meal1.addItem(new Coke1());

        return meal1;
    }
}
