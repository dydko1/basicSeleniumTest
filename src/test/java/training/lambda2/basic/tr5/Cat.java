package training.lambda2.basic.tr5;

public class Cat implements Animal, Addable {


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.say();
        cat.drink();
        System.out.println(cat.add(5, 25));
        System.out.println(cat.add(5, 25, 40));
    }

    @Override
    public void say() {
        System.out.println("sayyyyyyyyyy");
    }

    @Override
    public void drink() {
        System.out.println("drinkkkkkkkkkkkkk");
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
