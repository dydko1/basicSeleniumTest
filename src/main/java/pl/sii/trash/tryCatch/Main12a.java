package pl.sii.trash.tryCatch;

public class Main12a {
    public static void main(String[] args) {

        checkAge(18-1);
    }

    public static void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Access denied - You must be at least 18 years old!!");
        else
            System.out.println("Access granted !!!");
    }
}
