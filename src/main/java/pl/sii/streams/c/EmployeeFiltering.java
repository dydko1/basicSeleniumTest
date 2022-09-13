package pl.sii.streams.c;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFiltering {
    public static void main(String[] args) {
        Employee george = new Employee("George", 91);
        Employee mike = new Employee("Mike", 95);

        List<Employee> employees = List.of(george, mike, new Employee("Debra", 80),
                new Employee("Robbert", 50));

        List<Employee> employeeWith90MarksAndAbove=employees.stream().filter(s->s.hasOverNinetyMarks()).collect(Collectors.toList());
    }
}
