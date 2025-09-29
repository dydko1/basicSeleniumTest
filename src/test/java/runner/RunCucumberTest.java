package runner;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SelectClasspathResource;

@Suite
@IncludeEngines("cucumber")
// WSKAZUJE: Gdzie są pliki .feature (co generujeło ostrzeżenie, ale jest wymagane przez Pana strukturę)
@SelectClasspathResource("features")
// WSKAZUJE: Gdzie jest Glue Code
@SelectPackages("pack1")
public class RunCucumberTest {
    // ...
}