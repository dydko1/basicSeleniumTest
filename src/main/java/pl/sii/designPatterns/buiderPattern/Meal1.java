package pl.sii.designPatterns.buiderPattern;

import pl.sii.designPatterns.buiderPattern.interfAbs.Item1;

import java.util.ArrayList;
import java.util.List;

public class Meal1 {
    private List<Item1> items1 = new ArrayList<>();

    public void addItem(Item1 item1) {
        items1.add(item1);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item1 item1 : items1) {
            cost += item1.price();
        }

        return cost;
    }

    public void showItems() {
        for (Item1 item1 : items1) {
            System.out.println("Item name is:\t" + item1.name() +
                    "\nProduct is packing in:\t" + item1.packing().pack() +
                    "\nProduct price is:\t" + item1.price());
        }

        System.out.println("Total price is: " + getCost());
    }
}
