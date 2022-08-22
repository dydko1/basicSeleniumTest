package pl.sii.javaBeginers.doublecolon.d;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Java8MethodReference2 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("mkyong", 38, BigDecimal.valueOf(3800)),
                new Employee("zilap", 5, BigDecimal.valueOf(100)),
                new Employee("ali", 25, BigDecimal.valueOf(2500)),
                new Employee("unknown", 99, BigDecimal.valueOf(9999)));


        ComparatorProvider provider=new ComparatorProvider();
        list.sort((o1,o2)->o1.getSalary().compareTo(o2.salary));
        list.forEach(System.out::println);
    }
}
