package training.lambda2.basic.tr3;

public class SayMain3 {
    public static void main(String[] args) {
        Sayable3 say = (s1, s2) -> {
            return "Tu byl Miro" + s1 + s2;
        };
        System.out.println(say.say("ssdd","ffggg"));
    }
}
