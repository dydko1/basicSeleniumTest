package enum1.gg;

import java.util.EnumSet;

public class GFG123 {
    public static void main(String[] args) {
        EnumSet<Gfg> set1, set2, set3, set4;

        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.CODE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(Gfg.class);
        set4 = EnumSet.of(Gfg.CODE);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set3: " + set3);
        System.out.println("Set4: " + set4);
    }
}
