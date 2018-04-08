package org.mediawiki.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@smoke",
		features="src/test/resources/org/mediawiki/features/",
		glue="org/mediawiki/step_definitions",
		dryRun=false 
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

}
