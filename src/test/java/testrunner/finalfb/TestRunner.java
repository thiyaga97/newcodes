package testrunner.finalfb;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mypc\\eclipse-workspaces\\FinalFb\\src\\test\\resources\\FeatureFiles\\FinalFb.feature",
glue="stepdefinition.finalfb", dryRun=false, monochrome=true,
plugin= {"pretty", "html:target/webreports", "json:target/fbreports.json"})
public class TestRunner {

	
}
