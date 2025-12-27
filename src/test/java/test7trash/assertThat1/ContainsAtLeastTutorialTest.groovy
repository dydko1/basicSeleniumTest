package test7trash.assertThat1

import static org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.stream.Collectors

class ContainsAtLeastTutorialTest {
    @Test
    void shouldContainAtLeastExpectedCounts() {
        List<String> expected = List.of("CREATED", "UPDATED", "UPDATED");
        List<String> actual = List.of("CREATED", "UPDATED", "UPDATED", "UPDATED", "EXTRA");

        Map<String, Long> expectedCounts = expected.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        Map<String, Long> actualCounts = actual.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))

        expectedCounts.forEach((key, expectedCount) -> {
            long actualCount = actualCounts.getOrDefault(key, 0L);

            assertThat(actualCount)
                    .describedAs("Expected at least %d occurrences of '%s' but got %d",
                            expectedCount, key, actualCount)
                    .isGreaterThanOrEqualTo(expectedCount);
        });
    }


    @Test
     void assertSameOccurrences() {
        List<String> expected = List.of("CREATED", "UPDATED", "UPDATED");
        List<String> actual = List.of("CREATED", "UPDATED", "UPDATED")//, "UPDATED")//, "EXTRA");

        Map<String, Long> expectedCounts = counts(expected);
        Map<String, Long> actualCounts = counts(actual);
        assertThat(actualCounts)
                .describedAs("Expected same occurrences.\nExpected counts=%s\nActual counts=%s",
                        expectedCounts, actualCounts)
                .isEqualTo(expectedCounts);
    }

    private Map<String, Long> counts(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
}