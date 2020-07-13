
package stepDefinitions;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue= {"stepDefinitions"},
plugin = { "pretty", "html:target/cucumber-report" },
monochrome = true)
public class TestRunner{
}
