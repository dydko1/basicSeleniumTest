package test7trash.await2;

import org.awaitility.core.ThrowingRunnable;
import org.junit.Test;
import test7trash.await1.FakeService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import java.util.concurrent.TimeUnit;

public class Available2Test {

    StateService service = new StateService();

    @Test
    public void shouldRetryUntilValueIsAvailable() {

        ThrowingRunnable getState = () -> {
            State state = service.refresh();
            if (state.equals(State.INVALID)) {
                throw new IllegalStateException("Invalid state !!!!");
            }
            assertThat(state)
                    .describedAs("State should be READY")
                    .isEqualTo(State.READY);
        };

        await()
                .atMost(30, TimeUnit.SECONDS)
                .pollInterval(100, TimeUnit.MILLISECONDS)
                .untilAsserted(getState);
    }
}
