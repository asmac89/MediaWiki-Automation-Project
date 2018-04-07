package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiLoginPage;
import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUserPage;
import org.mediawiki.pages.MediaWikiWatchlistPage;
import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WatchListPageStepDefenition {
	
	private WebDriver driver=Driver.getDriver();
	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	MediaWikiUserPage userPage=new MediaWikiUserPage();	
	MediaWikiWatchlistPage watchList = new MediaWikiWatchlistPage();

	
	@When("^I click on the WatchList tab$")
	public void i_click_on_the_WatchList_tab() {
	    mainPage.MainPageWatchListButton.click();
	}
	
	@Then("^I should see the Watchlist options$")
	public void i_should_see_the_Watchlist_options() {
		assertTrue(watchList.WatchlistOptionsMenue.isDisplayed());
	}

	@Then("^I should see the Legend box$")
	public void i_should_see_the_Legend_box() {
	 assertTrue(watchList.LegendBox.isDisplayed());
	}

	@Then("^I click on dropdown list$")
	public void i_click_on_dropdown_list() {
	   
	}

	@Then("^I choose (\\d+) hour from dropdown list$")
	public void i_choose_hour_from_dropdown_list(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click on show button$")
	public void i_click_on_show_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The text above shoould contains \"([^\"]*)\"$")
	public void the_text_above_shoould_contains(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see the Watchlist Options$")
	public void i_should_see_the_Watchlist_Options() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Collapse button$")
	public void i_click_on_Collapse_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Text in Legend should be equals to \"([^\"]*)\"$")
	public void text_in_Legend_should_be_equals_to(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I choose (\\d+) days from dropdown list$")
	public void i_choose_days_from_dropdown_list(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
