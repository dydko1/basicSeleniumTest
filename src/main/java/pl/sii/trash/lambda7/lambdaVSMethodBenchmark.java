package pl.sii.trash.lambda7;

import java.util.function.Function;

public class lambdaVSMethodBenchmark {
    static int counter(int counter) {
        return counter + 1;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> function = counter -> counter + 1;
        //Start time
        long time1 = System.currentTimeMillis();
        //Lambda expression
        for (int i = 0; i < 900000000; i++) {
            function.apply(i);
        }
        //Lambda Apply Method End Time
        long time2 = System.currentTimeMillis();
        //Static counter
        for (int i = 0; i < 900000000; i++) {
            counter(i);
        }
        //Static Method End Time
        long time3 = System.currentTimeMillis();
        //Comparison
        System.out.println("Apply Method - Lambda Performance: " + (time2 - time1));
        System.out.println("Static Method: " + (time3 - time2));
    }
}