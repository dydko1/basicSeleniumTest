package pl.sii.javaBeginers.annotation;

public class Dog {
    String name;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Meow!!");
    }

    public void eat() {
        System.out.println("Cat eat meat.");
    }
}
