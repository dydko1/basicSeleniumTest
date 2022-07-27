package training.lambda2.basic.tr1;

public class MainSay {
    public static void main(String[] args) {
        Say say = () -> {
            return "Miro";
        };
        System.out.println(say.say());
    }
}
