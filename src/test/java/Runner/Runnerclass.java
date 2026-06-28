package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/featurefiles",
glue="Stepdefinations",
tags="@test",
plugin={"pretty", "html:target/cucumber-report.html",
		"rerun:"
		+ "target/failed.txt"},
monochrome=true)

public class Runnerclass extends AbstractTestNGCucumberTests {

}
