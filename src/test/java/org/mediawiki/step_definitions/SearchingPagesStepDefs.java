package org.mediawiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.mediawiki.pages.MediaWikiLoginPage;
import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUserPage;
import org.mediawiki.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.mediawiki.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchingPagesStepDefs {
	
	private WebDriver driver=Driver.getDriver();
	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	MediaWikiUserPage userPage=new MediaWikiUserPage();

	@Given("^I logged into MediaWiki$")
	public void i_logged_into_MediaWiki() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url")); 
	    loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
	}

	@When("^I click on special pages$")
	public void i_click_on_special_pages() {
		mainPage.specialPagesLink.click();
	    
	}

	@When("^I click on all pages$")
	public void i_click_on_all_pages() {
		mainPage.allPagesLink.click();
	    
	}

	@Then("^in the namespace dropdown list, \"([^\"]*)\" should be selected by default$")
	public void in_the_namespace_dropdown_list_should_be_selected_by_default(String firstDropdownOption) {
	    Select nameSpaceList=new Select(userPage.nameSpaceDropdown);
	    assertTrue(nameSpaceList.getFirstSelectedOption().getText().equals(firstDropdownOption));
	}

	@Then("^I type \"([^\"]*)\" in the Display pages starting at: text box$")
	public void i_type_in_the_Display_pages_starting_at_text_box(String startingCharacter) {
	    userPage.startingPagesField.sendKeys(startingCharacter);
	}

	@Then("^I type \"([^\"]*)\" in the Display pages ending at: text box$")
	public void i_type_in_the_Display_pages_ending_at_text_box(String endingCharacter) {
	    userPage.endingPagesField.sendKeys(endingCharacter);
	}

	@Then("^I select \"([^\"]*)\" in the namespace dropdown list$")
	public void i_select_in_the_namespace_dropdown_list(String dropdownOptions) {
		Select nameSpaceList=new Select(userPage.nameSpaceDropdown);
		nameSpaceList.selectByVisibleText(dropdownOptions);;
		userPage.goButton.click();
	}

	@Then("^all \"([^\"]*)\" pages should be displayed below$")
	public void all_pages_should_be_displayed_below(String dropdownOption) {
		List<WebElement> results=driver.findElements(By.xpath("//div[@class='mw-allpages-body']//li"));
		for(WebElement e:results) {
			assertTrue(e.getText().contains(dropdownOption));
		}
	}

	@Then("^I log out of the application$")
	public void i_log_out_of_the_application() {
		userPage.logoutLink.click();
	    
	}
}
