package pl.sii.trash.colonOperator;

import java.util.ArrayList;
import java.util.List;

public class Test07052023_1 {
    public static void main(String[] args) {
        List<Test> strings = new ArrayList<Test>();
        strings.add(new Test("sssss"));
        strings.add(new Test("sdd"));
        strings.add(new Test("fff"));

        strings.forEach(Test::someFunction1);
    }
}
