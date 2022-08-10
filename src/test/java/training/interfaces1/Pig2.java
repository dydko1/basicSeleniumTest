package training.interfaces1;

public class Pig2 implements Animal2{
    @Override
    public void makeSound() {
        System.out.println("Pig is singing");
    }

    @Override
    public void sleep() {
        System.out.println("Pig sleeps");
    }
}
