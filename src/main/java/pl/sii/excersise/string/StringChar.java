package pl.sii.excersise.string;

public class StringChar {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog.";

        char[] ch=s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);

        }
    }
}
