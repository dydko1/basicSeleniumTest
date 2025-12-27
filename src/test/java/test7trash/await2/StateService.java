package test7trash.await2;

import java.util.concurrent.ThreadLocalRandom;

public class StateService {

    private Integer calls = 0;

    State refresh() {
        calls++;
        Integer value = ThreadLocalRandom.current().nextInt(4);

        System.out.printf("Wartosc calls jest: %s, value: %s ", calls, value);
        if (calls < 2)
            return State.NOT_READY;
        if (calls.equals(2))
            return State.PARTIAL;
        if (value.equals(3))
            return State.INVALID;
        return State.READY;
    }
}