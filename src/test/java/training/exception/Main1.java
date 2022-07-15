package training.exception;

public class Main1 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally {
            System.out.println("papapapap");
        }
    }
}