package pl.sii.trash.lambda7;

import java.util.ArrayList;
import java.util.Locale;

public class Lambda7Unary {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("onur");
        arrayList.add("swtestacademy");
        arrayList.add("java");

        System.out.println(arrayList);

        arrayList.replaceAll(e -> e + " ddddd");
        arrayList.stream().filter(s->s.contains("onur")).map(s-> s.toUpperCase());
        System.out.println(arrayList);

    }
}
