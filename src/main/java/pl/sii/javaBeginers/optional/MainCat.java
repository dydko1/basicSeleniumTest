package pl.sii.javaBeginers.optional;

import java.util.Optional;

public class MainCat {
    public static void main(String[] args) {

        Optional<Cat> cat = getCat();
        //cat.get().age=500;
        if(cat.isPresent())
            System.out.println(cat.get().getAge() + "\t" + getCat().get().getName());

    }

    private static Optional<Cat> getCat() {
        Cat cat = new Cat(1, "Burek");
        return Optional.ofNullable(null);
    }
}
