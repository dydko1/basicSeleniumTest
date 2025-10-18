package demo;

public class BaseSteps {

    public static String process(String input) {
        if (!input.startsWith("$"))
            return input;

        String command = input.substring(1);
        ProcessorTutorial processorTutorial = new ProcessorTutorial(command);
        return processorTutorial.processMatchingFunction();
    }
}