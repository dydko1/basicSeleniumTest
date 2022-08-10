package training.lambda2.advance1;

public class LambdaExpression08 {
    public static void main(String[] args) {
        Sayabble56 joinText = n -> {
            String s1="This is my ";
            String s2=s1+" first sentence " + n;
            return s2;
        };

        System.out.println(joinText.jointString("eeeeee"));
    }
}
