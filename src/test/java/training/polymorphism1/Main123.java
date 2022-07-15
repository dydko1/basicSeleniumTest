package training.polymorphism1;

import java.util.Arrays;
import java.util.List;

public class Main123 {
    public static void main(String[] args) {
        Animal defaultAnimal = new Animal();
        Animal dog = new Dog();
        Animal pig = new Pig();

        List<Animal> animals = Arrays.asList(defaultAnimal, dog, pig);
        for (Animal a : animals) {
            a.makeSound();
        }

//        defaultAnimal.makeSound();
//        dog.makeSound();
//        pig.makeSound();
    }
}
