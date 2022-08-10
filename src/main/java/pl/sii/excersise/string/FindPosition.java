package pl.sii.excersise.string;

import java.util.ArrayList;
import java.util.HashMap;

public class FindPosition {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog.";

        int n = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println(s.charAt(i));
            if (!hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i), i);
        }
        System.out.println(hashMap);

        ArrayList<Character > chTab = new ArrayList<>();
        for (int i = 65; i < 122; i++) {
            chTab.add((char) i);
        }

        System.out.println(chTab);

        s=s.replace("a","H");
        System.out.println(s.substring(2,5));
    }
}
