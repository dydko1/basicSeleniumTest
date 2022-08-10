package training.old1;

public class Car extends Vehicle {
    protected String modelName = "Mustang";    // Car attribute

    public Car() {
        System.out.println("Constructor 2 run\n");
    }

    @Override
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!" + modelName);
    }
}
