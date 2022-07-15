package training.exception;

public class Main2 {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied !!- you must be at least 18 years old");
        } else {
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {

        checkAge(10);
    }


}
