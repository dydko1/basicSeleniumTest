package w3schools.lambda;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Tu byl Miro");
            }
        };

        Thread t1 = new Thread(r1);

        t1.start();

        Runnable r2=()->{
            System.out.println("dddd");
        };

        Thread t2=new Thread(r2);
        t2.run();
    }
}
