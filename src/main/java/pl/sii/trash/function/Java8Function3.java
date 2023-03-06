package pl.sii.trash.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Java8Function3 {
    public static void main(String[] args) {
        Java8Function3 obj = new Java8Function3();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
        Map<String, Integer> map = obj.convertToList(list, x -> x.length());

        System.out.println("eee=" + map);

        Map<String, Integer> map2 = obj.convertToList(list, obj::getLength);
        System.out.println(map2);

    }

    private <T, R> Map<T, R> convertToList(List<T> list, Function<T, R> func) {

        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    }

    private Integer getLength(String s) {
        return s.length();
    }
}