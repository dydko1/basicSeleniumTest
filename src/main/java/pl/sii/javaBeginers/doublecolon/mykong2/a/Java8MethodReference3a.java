package pl.sii.javaBeginers.doublecolon.mykong2.a;

public class Java8MethodReference3a {
    public static void main(String[] args) {

        int res1 = MethodProvider.playOneArgument("test12", x -> x.length());
        System.out.println(res1);
        int res2 = MethodProvider.playOneArgument("ala", String::length);
        System.out.println(res2);
        // -----------
        Boolean res3 = MethodProvider.playTwoArguments("Nuka", "u", (a1, a2) -> a1.contains(a2));
        System.out.println(res3);
        // -----------
        Boolean res4 = MethodProvider.playTwoArguments("Nuczka", "z", String::contains);
        System.out.println(res4);

        Boolean res5 = MethodProvider.playTwoArguments("alaaaa", "a", (a1, a2) -> a1.toLowerCase().startsWith(a2));
        System.out.println(res5);
        Boolean res6 = MethodProvider.playTwoArguments("asdffff", "s", String::startsWith);


    }


}
