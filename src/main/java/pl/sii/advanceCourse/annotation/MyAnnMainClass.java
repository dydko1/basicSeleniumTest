package pl.sii.advanceCourse.annotation;
import java.lang.reflect.Method;

public class MyAnnMainClass {

    @MyCustomAnnotation(value = 520)
    public void sayHello() {
        System.out.println();
    }

    public static void main(String[] args) {
        MyAnnMainClass h1 = new MyAnnMainClass();
        try {
            Method method = h1.getClass().getMethod("sayHello");
            MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Val is: " + myCustomAnnotation.value());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
