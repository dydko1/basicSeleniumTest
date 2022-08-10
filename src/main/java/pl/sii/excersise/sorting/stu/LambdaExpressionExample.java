package pl.sii.excersise.sorting.stu;

interface Lambda {
    int display(int number);
}

interface Lambda2 {
    void display(int number);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        /*
        store lambda in a variable of type interface that has
        only one method.
         */
        Lambda lambda = number -> {
            return number * number;
        };
        /*
        The above code block will be called whenever display
        method is called using `lambda` variable
        */
        System.out.println(lambda.display(20));

        Lambda2 lambda2 = (k) -> {
            System.out.println("ddddd" + k);
        };

        lambda2.display(20);
    }
}