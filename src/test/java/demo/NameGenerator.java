package demo;

import java.util.List;
import java.util.Random;

public class NameGenerator {

    private static final List<String> MALE_NAMES = List.of("Jan", "Tomasz", "Piotr", "Marek", "Adam");
    private static final List<String> FEMALE_NAMES = List.of("Anna", "Kasia", "Ewa", "Magda", "Ola");

    private static final Random random = new Random();

    public static String maleName() {
        return MALE_NAMES.get(random.nextInt(MALE_NAMES.size()));
    }

    public static String femaleName() {
        return FEMALE_NAMES.get(random.nextInt(FEMALE_NAMES.size()));
    }
}