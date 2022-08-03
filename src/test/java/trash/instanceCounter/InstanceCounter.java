package trash.instanceCounter;

public class InstanceCounter {

    private static int numInstances = 0;

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public static void main(String[] args) {

        final InstanceCounter x = new InstanceCounter();

        System.out.println("Starting with: " + InstanceCounter.getCount());

        for (int i = 0; i < 50; i++)
            new InstanceCounter();

        System.out.println("Starting with: " + InstanceCounter.getCount());
    }
}
