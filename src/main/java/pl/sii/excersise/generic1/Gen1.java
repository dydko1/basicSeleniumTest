package pl.sii.excersise.generic1;

public class Gen1<T> {
    T t;

    public Gen1(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
