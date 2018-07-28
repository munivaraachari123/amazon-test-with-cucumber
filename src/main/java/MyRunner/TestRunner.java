package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\APITesting\\cucumber-demo\\src\\main\\java\\Features\\login.feature",
	glue = "StepDefinations",
	monochrome = true,
	dryRun = false,
	strict = true,
	format = {"pretty", "html:test-html-output", "junit: test-xml-output/xmloutput.xml"}
	)
public class TestRunner {

}
