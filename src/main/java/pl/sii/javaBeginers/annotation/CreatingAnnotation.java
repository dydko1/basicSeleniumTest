package pl.sii.javaBeginers.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotation {
    public static void main(String[] args) {
        Cat myCat = new Cat("Mruczek");
        Dog myDog = new Dog("Misiek");

//        if(myCat.getClass().isAnnotationPresent(VeryImportant.class))
//            System.out.println("This thing is very important!");
//        else
//            System.out.println("This things is not very important.");

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation=method.getAnnotation(RunImmediately.class);
                try {
                    //method.invoke(myCat);
                    for (int i = 0; i <annotation.times(); i++) {
                        method.invoke(myCat);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
