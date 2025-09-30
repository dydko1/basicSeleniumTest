package test6.stringjoining;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoining {

    @Test
    public void loopArrayOfIntegerIntoAString() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        StringBuilder builder = new StringBuilder("*");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                builder.append("*, *");
            }
            builder.append(numbers[i]);
        }
    }

    @Test
    public void streamAnArrayOfIntegerAndMapCollectorsJoining() {
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Collectors.joining requires elements to be CharSequence
        // delimiter is first, followed by prefix and then suffix
        Stream<Integer> stream = Stream.of(numbers);
        String streamedJoining = stream
                .map(String::valueOf)
                .collect(Collectors.joining("*, *", "a","z"));
        System.out.println(streamedJoining);
    }

    @Test
    public void adaptAnArrayOfIntegerAndMakeString()
    {
        Integer[] numbers = {1, 2, 3, 4, 5};
//
//        ArrayAdapter<Integer> adapted = ArrayAdapter.adapt(numbers);
//
//        // makeString does not require elements to be CharSequence
//        // prefix is first, then delimiter and then suffix
//        String makeString = adapted.makeString("*", "*, *","*");
//
//        Assertions.assertEquals("*1*, *2*, *3*, *4*, *5*", makeString);
    }
}
