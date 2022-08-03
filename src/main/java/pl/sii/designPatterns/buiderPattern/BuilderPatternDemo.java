package pl.sii.designPatterns.buiderPattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal1 vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();

        Meal1 nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
    }
}
