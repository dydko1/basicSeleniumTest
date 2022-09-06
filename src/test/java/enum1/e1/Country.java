package enum1.e1;

import java.util.Arrays;
import java.util.List;

public enum Country {
    SRILANKA(),
    US(UnitedStates.values()),
    ARGENTINA(ArgentinaStates.values());

    Country(State... states) {
        this.states = Arrays.asList(states);
    }

    private final List<State> states;

    public List<State> getStates() {
        return states;
    }
}