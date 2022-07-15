package training.old1;

public class Vehicle {
    protected String brand = "Ford";

    public Vehicle() {
        System.out.println("Constructor 1 run");
    }

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!" + brand);
    }
}
