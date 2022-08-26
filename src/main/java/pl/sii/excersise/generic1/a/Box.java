package pl.sii.excersise.generic1.a;

public class Box<T> {
    private T t;

    public void add(T t1) {
        this.t = t1;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<Integer>();
        Box<String> boxString = new Box<String>();

        boxInt.add(11);
        boxString.add(new String("Cześć Miro"));
        System.out.println(boxInt.getT());
        System.out.println(boxString.getT());
    }
}
