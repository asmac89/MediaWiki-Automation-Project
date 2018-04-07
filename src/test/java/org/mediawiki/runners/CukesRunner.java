package org.mediawiki.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty",
				"html:target/cucumber-report"},

		tags="@andytest",
		features="src/test/resources/org/mediawiki/features/",
		glue="org/mediawiki/step_definitions",
		dryRun=false //by default, it is false
		//branch 'master' of https://github.com/asmac89/MediaWiki-Automation-Project.git
		)

public class CukesRunner extends AbstractTestNGCucumberTests {

}
 