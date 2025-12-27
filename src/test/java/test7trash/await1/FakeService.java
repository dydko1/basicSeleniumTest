package test7trash.await1;

import java.util.concurrent.ThreadLocalRandom;

public class FakeService {
    static int fetchValue() {
        Integer value = ThreadLocalRandom
                .current()
                .nextInt(10);
        System.out.printf("Wylosowano wartość jest: %s\n", value);
        return value;
    }
}
