package test7trash.await3;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

class AwaitWithAtomicExampleTest {

    static class FakeService {
        private int calls = 0;

        int refreshValue() {      // <-- "refresh": pobierz swiezy stan
            calls++;
            return calls < 3 ? 0 : 10; // dopiero od 3. proby jest OK
        }
    }

    @Test
    void shouldRetryMax30SecondsOr3Attempts() {
        FakeService service = new FakeService();
        AtomicInteger attempts = new AtomicInteger(0); // <-- licznik prob

        await()
                .atMost(30, TimeUnit.SECONDS)               // limit czasu
                .pollInterval(1, TimeUnit.SECONDS)          // co ile probujemy
                .untilAsserted(() -> {

                    int n = attempts.incrementAndGet();       // 1) zwieksz licznik prob (1..3..)
                    int value = service.refreshValue();       // 2) REFRESH: pobierz nowe dane

                    // 3) FAIL-FAST: bledy logiczne (tu tylko przyklad)
                    if (value < 0) {
                        throw new IllegalStateException("Invalid value - fail fast");
                    }

                    // 4) Asercja docelowa
                    assertThat(value)
                            .describedAs("Attempt %d/3: value must be > 0, got %d", n, value)
                            .isGreaterThan(0);

                    // 5) Limit prob: jesli to byla 3 proba i nadal by nie przeszlo,
                    //    to asercja wyzej rzucilaby AssertionError i Awaitility zakonczy test.
                    //    Jesli przeszlo - Awaitility konczy natychmiast.
                    if (n >= 3) {
                        // nie robimy nic - to tylko czytelny marker intencji
                    }
                });
    }
}
