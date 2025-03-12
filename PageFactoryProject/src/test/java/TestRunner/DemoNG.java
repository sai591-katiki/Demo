package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\sample3.feature",glue= {"StepDefnition","Hooks"},
plugin = {"pretty","html:target/cucumberreport/report3.html"},monochrome = true)
public class DemoNG extends AbstractTestNGCucumberTests {

}
