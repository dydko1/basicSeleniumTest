package pack1;

import io.cucumber.java.en.Given;

import java.util.*;

public class NameSteps {

    static final List<String> FEMALE_NAME = Arrays.asList("Anna", "Hanna", "Wanda");
    static final List<String> MALE_NAME = Arrays.asList("Miro", "Janek", "Hugo");
    static final Random RANDOM = new Random();
    Map<String, List<String>> GENDER = Map.of("female", FEMALE_NAME, "male", MALE_NAME);

    @Given("I generate $name.{word}")
    public String generateNameByGender(String gender) {
        List<String> names = GENDER.get(gender.toLowerCase());
        if (names == null) {
            throw new IllegalArgumentException("Unknown parameter");
        }
        String s = getName(names);
        System.out.println(s);
        return s;
    }

    private String getName(List<String> nameList) {
        return nameList.get(RANDOM.nextInt(nameList.size()));
    }
}