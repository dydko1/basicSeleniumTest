package training.interfaces1;

import java.util.Arrays;
import java.util.List;

public class MainInterfaces {
    public static void main(String[] args) {
        Animal2 cat2 = new Cat2();
        Animal2 dog2 = new Dog2();
        Animal2 pig2 = new Pig2();

        // cat2 = new Dog2();
        List<Animal2> animal2s = Arrays.asList(cat2, pig2, dog2);

        for (Animal2 animal2 : animal2s) {
            animal2.makeSound();
            //animal2.sleep();
        }
    }
}
