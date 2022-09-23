package pl.sii.trash.lambda3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava82 {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );

        List<String> result = new ArrayList<>();
        for (Staff s : staff)
            result.add(s.getName());

        System.out.println(result);

        List<String> col=staff.stream().map(s-> s.getName()).collect(Collectors.toList());
        System.out.println(col);
    }
}