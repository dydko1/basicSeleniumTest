package training.interfaces1;

public class Dog2 implements Animal2{

    @Override
    public void makeSound() {
        System.out.println("Dog is singing");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
