package pack1.tutorial40;

import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {

    public static String phone() {
        return ("48501" + ThreadLocalRandom.current().nextInt(100_000, 1_000_000));

    }

    public static String email() {
        return "test" + ThreadLocalRandom.current().nextInt(100, 999) + "@mail.com";
    }

    public static String pesel() {
        return "910520192" + ThreadLocalRandom.current().nextInt(10, 100);
    }
}
