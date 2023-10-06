package pl.sii.javalambda.packageReference;

public class Main21 {
    public static void main(String[] args) {
        Calculator21 calculator21 = new Calculator21();
        String result = calculator21.calc((a1, b1) -> "x=\t" + (a1 + b1 + 50), 2, 4);
        System.out.println(result);
    }
}
