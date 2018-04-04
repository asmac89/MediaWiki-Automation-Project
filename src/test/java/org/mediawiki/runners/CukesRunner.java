package org.mediawiki.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty",
				"html:target/cucumber-report"},
		tags="@asmatestcase",
		features="src/test/resources/org/mediawiki/features/",
		glue="org/mediawiki/step_definitions",
		dryRun=true //by default, it is false
		)

public class CukesRunner extends AbstractTestNGCucumberTests {

}
