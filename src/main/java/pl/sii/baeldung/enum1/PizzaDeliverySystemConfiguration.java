package pl.sii.baeldung.enum1;

public enum PizzaDeliverySystemConfiguration {
    INSTANCE;

    PizzaDeliverySystemConfiguration() {
        // Do the configuration initialization which
        // involves overriding defaults like delivery strategy
    }

    private PizzaDeliveryStrategy deliveryStrategy = PizzaDeliveryStrategy.NORMAL;

    public static PizzaDeliverySystemConfiguration getInstance() {
        return INSTANCE;
    }

    public PizzaDeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

}