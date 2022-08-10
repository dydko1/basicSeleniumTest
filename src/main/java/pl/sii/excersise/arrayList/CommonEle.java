package pl.sii.excersise.arrayList;

import java.util.*;

public class CommonEle {
    public static void main(String[] strings) {
        String[] s1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] s2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s1.length; i++)
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equalsIgnoreCase(s2[j]))
                    set.add(s1[i]);
            }

        Integer[] abc = {1, 2, 3, 4, 5, 6, 7,7,7,7};

        Set<Integer> set2 = new HashSet<>(Arrays.asList(abc));

        System.out.println(set);
        System.out.println(set2);
    }
}
