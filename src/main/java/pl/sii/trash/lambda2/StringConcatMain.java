package pl.sii.trash.lambda2;

public class StringConcatMain {
    public static void main(String[] args) {
        StringConcat stringConcat = (s1, s2) -> s1 + s2;

        System.out.println(stringConcat.stringConcat("ddd", "dd"));
    }
}
