package org.mediawiki.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.mediawiki.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setup(Scenario scenario) {
		WebDriver driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			//takes a screenshot
			final byte[] screenshot = ((TakesScreenshot) 
			Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			//adds the screenshots to the report
			scenario.embed(screenshot, "image/png");
		}
		
	//	Driver.closeDriver();

	}

}
