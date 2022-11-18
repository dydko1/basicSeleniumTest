package lombok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class TestData {
    String name;
    String lastname;

    List<String> lists = Arrays.asList("1111", "ddddd", "dd");
}
