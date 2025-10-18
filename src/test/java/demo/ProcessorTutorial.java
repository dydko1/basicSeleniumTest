package demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProcessorTutorial {
    private final String command;

    public String processMatchingFunction() {
        return switch (command) {
            case "maleName" -> NameGenerator.maleName();
            case "femaleName" -> NameGenerator.femaleName();
            default -> "UNKNOWN_COMMAND";
        };
    }
}