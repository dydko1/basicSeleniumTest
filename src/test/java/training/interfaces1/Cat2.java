package training.interfaces1;

public class Cat2 implements Animal2{
    @Override
    public void makeSound() {
        System.out.println("Cat is singing");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");

    }
}
