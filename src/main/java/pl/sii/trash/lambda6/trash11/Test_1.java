package pl.sii.trash.lambda6.trash11;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;

@Getter
@Setter
public class Test_1 {
    Employee employee;

    @Test
    public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {

        getEmployee().builder().id(1).name("ddd").salary(20.0).lastName("dd");


    }

}
