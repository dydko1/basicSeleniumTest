
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.core.options.Constants.FILTER_TAGS_PROPERTY_NAME;

// KLUCZOWE ADNOTACJE DLA JUNIT 5
@Suite
@IncludeEngines("cucumber") // Mówi JUnit Platform, aby użył silnika Cucumbera

// Konfiguracja (odpowiednik @CucumberOptions)
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@TablesType")
@ConfigurationParameter(key = "cucumber.glue", value = "pack1")
@ConfigurationParameter(key = "cucumber.features", value = "classpath:features")
//@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-reports/index.html")
public class RunCucumberTest {
    // Ta klasa może być pusta. Służy tylko jako punkt wejścia.
}