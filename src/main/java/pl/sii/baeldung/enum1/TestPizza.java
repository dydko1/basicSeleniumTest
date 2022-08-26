package pl.sii.baeldung.enum1;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPizza {
    @Test
    public void givenPizaOrder_whenReady_thenDeliverable() {

        List<Pizza> pzList = new ArrayList<>();
        Pizza pz1 = new Pizza();
        pz1.setStatus(PizzaStatus.DELIVERED);

        Pizza pz2 = new Pizza();
        pz2.setStatus(PizzaStatus.ORDERED);

        Pizza pz3 = new Pizza();
        pz3.setStatus(PizzaStatus.ORDERED);

        Pizza pz4 = new Pizza();
        pz4.setStatus(PizzaStatus.READY);

        pzList.add(pz1);
        pzList.add(pz2);
        pzList.add(pz3);
        pzList.add(pz4);

        List<Pizza> undeliveredPzs = Pizza.getAllUndeliveredPizzas(pzList);
        undeliveredPzs.forEach(s-> System.out.println(s.getStatus()));
        //assertTrue(undeliveredPzs.size() == 3);
    }
}
