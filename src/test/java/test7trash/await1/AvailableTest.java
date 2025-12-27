package test7trash.await1;

import org.awaitility.core.ThrowingRunnable;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class AvailableTest {
    private final static Integer conditionValue = 9;

    @Test
    public void shouldRetryUntilValueIsAvailable() {

        ThrowingRunnable getFakeData = () -> {
            Integer value = FakeService.fetchValue();
            assertThat(value)
                    .describedAs("Value should be equal %s.", conditionValue)
                    .isEqualTo(conditionValue);
        };

        await()
                .atMost(5, TimeUnit.SECONDS)
                .pollInterval(100, TimeUnit.MILLISECONDS)
                .untilAsserted(getFakeData);

    }
}
