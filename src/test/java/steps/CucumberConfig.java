package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features",
        plugin = {"pretty",
                "html:target/reports/htmlReports.html",
                "json:target/reports/jsonReports.json"},
        glue = {"steps"})
public class CucumberConfig {}
