package threadlocalminiproject.context;

public class TestContext {
    private String userId;
    private String browser;
    private String environment;

    public TestContext(String userId, String browser, String environment) {
        this.userId = userId;
        this.browser = browser;
        this.environment = environment;
    }

    public String getUserId() {
        return userId;
    }

    public String getBrowser() {
        return browser;
    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public String toString() {
        return "userId=" + userId +
                ", browser=" + browser +
                ", env=" + environment;
    }
}
