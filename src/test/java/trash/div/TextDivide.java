package trash.div;

import trash.a_betterScripts.Test;

import java.util.Arrays;
import java.util.List;

public class TextDivide {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            String[] city = TextSpliter.cityCode();
            System.out.println(city[0] + " ***** " + city[1]);
        }


//        String s = "10.2.3.4.5";
//        String[] sTab = s.split("\\.");
//        for (String s1 : sTab) {
//            System.out.println(s1);
//        }
//        List<String> list = Arrays.asList(sTab);
//        list.forEach(o-> System.out.println(o));
    }
}
