package pl.sii.trash.function;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Java8Function4 {
    public static void main(String[] args) {
        Java8Function4 java8Function4 = new Java8Function4();

        List<String> list = Arrays.asList("node", "c++", "java", "javascipt");
        List<String> res1 = java8Function4.map(list, java8Function4::sha256);
        res1.forEach(System.out::println);

    }

    public <T, R> List<R> map(List<T> list, Function<T, R> func) {
        List<R> res = new ArrayList<>();
        for (T t : list) {
            res.add(func.apply(t));
        }
        return res;
    }

    public String sha256(String s) {
        return DigestUtils.sha256Hex(s);
    }
}
