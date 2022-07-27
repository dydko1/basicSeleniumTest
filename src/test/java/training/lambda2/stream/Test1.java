package training.lambda2.stream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static List<Employee> empList = Arrays.asList(arrayOfEmps);

    @Test
    public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {
//        empList.stream().forEach(e -> e.salaryIncrement(10.0));
//
//        assertThat(empList, contains(
//                hasProperty("salary", equalTo(110000.0)),
//                hasProperty("salary", equalTo(220000.0)),
//                hasProperty("salary", equalTo(330000.0))
//        ));
    }
}
