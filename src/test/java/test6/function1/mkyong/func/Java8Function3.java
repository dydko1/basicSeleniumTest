package test6.function1.mkyong.func;

import java.util.*;

public class Java8Function3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        Convert<String, Integer> convert = new Convert<>();
        Map<String, Integer> map1 = convert.convertListToMap(list, String::length);
        System.out.println(map1);
        Map<String, Integer> map2 = convert.convertListToMap(list, convert::getLength);
        System.out.println(map2);
        Map<String, String> map3 = convert.convertListToMap(list, convert::sha256);
        System.out.println(map3);

        //Convert<String, String> convert2 = new Convert<>();
        System.out.println("---------------------------------");
        Map<String, String> map4 = convert.convertListToMap(list, convert::sha256);
        System.out.println(map4);
        System.out.println("---------------------------------");


//          Java8Function3 obj = new Java8Function3();
//        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
//        Map<String, Integer> map = new Convert.convertListToMap(list, x -> x.length());
//        System.out.println(map);
//        Map<String,Integer> map2=obj.convertListToMap(list, obj::getLength);
//        System.out.println(map2);
    }

}
