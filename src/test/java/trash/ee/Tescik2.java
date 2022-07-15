package trash.ee;

import java.util.TreeMap;

public class Tescik2 implements Tescik {
    @Override
    public String test(String s) {
        return s+ "kkkkk";
    }

    public static void main(String[] args) {
        String kk = "ddddd";
        Tescik2 tescik2 = new Tescik2();
        String gg=tescik2.test(kk);
        System.out.println(gg);
    }
}
