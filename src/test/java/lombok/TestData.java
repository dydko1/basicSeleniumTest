package lombok;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class TestData {
    String name;
    String lastname;

    List<String> lists;


    public TestData() {
        this.name = "Miro_" + RandomStringUtils.randomAlphanumeric(10);
        this.lastname = "Dydko_" + RandomStringUtils.randomAlphanumeric(10);
        //this.lists = lists;
        lists = Arrays.asList("nap1", "nap2", "nap3");
    }
}
