package test6.function1.generic1;

public class MainPrinter {
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>();
        String[] names = {"Jenny", "Liam"};

        // Array of Integers
        Integer[] numbers = {1, 2, 3};

        printer.printArray(names);
        printer.printArray(numbers);
    }
}
