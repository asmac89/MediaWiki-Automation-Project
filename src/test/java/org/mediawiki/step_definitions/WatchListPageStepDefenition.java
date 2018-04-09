package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiLoginPage;
import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUserPage;
import org.mediawiki.pages.MediaWikiWatchlistPage;
import org.mediawiki.utilities.BrowserUtils;
import org.mediawiki.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WatchListPageStepDefenition {
	
	private WebDriver driver=Driver.getDriver();
	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	MediaWikiUserPage userPage=new MediaWikiUserPage();	
	MediaWikiWatchlistPage watchList = new MediaWikiWatchlistPage();
	BrowserUtils browserUtils = new BrowserUtils();

	@When("^I click on the WatchList tab$")
	public void i_click_on_the_WatchList_tab() {
	    mainPage.MainPageWatchListButton.click();
	}
	
	@Then("^I should see the Watchlist Options$")
	public void i_should_see_the_Watchlist_Options() {
		assertTrue(watchList.WatchlistOptionsMenue.isDisplayed());
	}

	@Then("^I should see the Legend box$")
	public void i_should_see_the_Legend_box() {
	 assertTrue(watchList.LegendBox.isDisplayed());
	}
	
	@Then("^I choose (\\d+) hour\"([^\"]*)\" from dropdown list$")
	public void i_choose_hour_from_dropdown_list(int arg1, String oneHoure) {
		Select select = new Select(watchList.WatchlistDropDownDays);
		select.selectByVisibleText(oneHoure);
	}
	
	@Then("^I choose (\\d+) days \"([^\"]*)\" from dropdown list$")
	public void i_choose_days_from_dropdown_list(int arg1, String days90) {
		Select select = new Select(watchList.WatchlistDropDownDays);
		select.selectByVisibleText(days90);
	}

	@Then("^I click on show button$")
	public void i_click_on_show_button() {
		watchList.WatchlistShowButton.click();
	}
	
	@Then("^The text above shoould contains changes in the last hour\"([^\"]*)\"$")
	public void the_text_above_shoould_contains_changes_in_the_last_hour(String Text) {
		assertTrue(watchList.WatchlistTextChanges.getText().contains(Text)); 
	}
	
	@Then("^The text above shoould contains changes in the last (\\d+),(\\d+) hours\"([^\"]*)\"$")
	public void the_text_above_shoould_contains_changes_in_the_last_hours(int arg1, int arg2, String Text) {
		assertTrue(watchList.WatchlistTextChanges.getText().contains(Text)); 
	}

	@When("^I click on Collapse button$")
	public void i_click_on_Collapse_button() {
	    watchList.WatchlistCollapseButton.click();
	}
	
	
	@Then("^Text in Legend should not be dispaly$")
	public void text_in_Legend_should_not_be_dispaly() {
	    assertTrue(watchList.WatchlistCollapseText.isEnabled());
	}


	
}
