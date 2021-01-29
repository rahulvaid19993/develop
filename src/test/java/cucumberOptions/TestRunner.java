package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features/login.feature",glue="stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
