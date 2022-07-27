package training.lambda2.basic.tr2;

public class MainSay2 {
    public static void main(String[] args) {
        Say1 say = (name) -> {
            return "Miro " + name;
        };

        System.out.println(say.say("ssssssss"));
    }
}
