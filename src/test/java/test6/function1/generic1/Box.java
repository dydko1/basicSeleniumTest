package test6.function1.generic1;

public class Box<T> {

    T v;

    void set(T v) {
        this.v = v;
    }

    T get() {
        return v;
    }
}
