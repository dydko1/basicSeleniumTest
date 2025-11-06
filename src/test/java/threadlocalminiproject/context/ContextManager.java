package threadlocalminiproject.context;

public class ContextManager {
    private static final ThreadLocal<TestContext> testContext = new ThreadLocal<>();

    public static void setContext(TestContext context) {
        testContext.set(context);
    }

    public static TestContext getContext() {
        return testContext.get();
    }

    public static void removeContext(){
        testContext.remove();
    }
}
