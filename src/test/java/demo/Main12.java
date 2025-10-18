package demo;

public class Main12 {
    public static void main(String[] args) {
        System.out.println(BaseSteps.process("Warszawa"));
        System.out.println(BaseSteps.process("$maleName"));
        System.out.println(BaseSteps.process("$femaleName"));
        System.out.println(BaseSteps.process("$unknownThing"));
    }
}
