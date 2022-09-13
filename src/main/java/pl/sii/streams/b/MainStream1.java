package pl.sii.streams.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream1 {
    public static void main(String[] args) {
        Customer john = new Customer("John P.", 15);
        Customer sarah = new Customer("Sarah M.", 200);
        Customer charles = new Customer("Charles B.", 150);
        Customer mary = new Customer("Mary T.", 1);
        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);

        // List<Customer> customerWithMore100Points=customers.stream().filter(c->c.getPoints()>100).collect(Collectors.toList());
        // customerWithMore100Points.stream().forEach(customer -> System.out.println(customer.getPoints()));

        List<Customer> cus = customers.stream().filter(Customer::hasOverHundredPoints).collect(Collectors.toList());
        cus.stream().forEach(customer -> System.out.println(customer.getPoints()));

        List<Customer> charlesWithMoreThan100Points = customers.stream().filter(c -> c.getPoints() > 100 && c.getName().startsWith("Charles")).collect(Collectors.toList());
        charlesWithMoreThan100Points.stream().forEach(customer -> System.out.println(customer.getPoints()));
    }
}
