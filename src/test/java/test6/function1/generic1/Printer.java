package test6.function1.generic1;

public class Printer<X1>{

    public <t> void printArray(t[] array) {
        for (t item : array) {
            System.out.println(item );
        }
    }
}
