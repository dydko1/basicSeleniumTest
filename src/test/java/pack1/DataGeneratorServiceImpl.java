package pack1;

public class DataGeneratorServiceImpl implements DataGeneratorService {
    // ... Logika z NameSteps.java przeniesiona tutaj ...

    private NameSteps nameSteps=new NameSteps();
    @Override
    public String resolveDynamicArgument(String argument) {
        if (argument != null && argument.startsWith("$name.")) {
            String genderType = argument.substring("$name.".length());
            // Zwraca wygenerowane imię
            if (genderType.equalsIgnoreCase("female")) return getRandomFemaleName(); 
            if (genderType.equalsIgnoreCase("male")) return getRandomMaleName();
        }
        System.out.println(argument);
        return argument; // Zwraca niezmieniony, jeśli to nie generator
    }

    private String getRandomMaleName() {
        return nameSteps.generateNameByGender("female");
    }

    private String getRandomFemaleName() {
        return nameSteps.generateNameByGender("male");
    }
    // ... implementacje getRandomFemaleName() i getRandomMaleName() ...
}