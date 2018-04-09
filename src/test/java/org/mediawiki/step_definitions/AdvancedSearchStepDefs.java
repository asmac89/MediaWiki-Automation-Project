package org.mediawiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPage;
import org.mediawiki.pages.MediaWikiMainPageEditPage;
import org.mediawiki.pages.MediaWikiSearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvancedSearchStepDefs {
	
	MediaWikiMainPage MainPage = new MediaWikiMainPage();
	MediaWikiMainPageDiscussionPage DiscussionPage = new MediaWikiMainPageDiscussionPage();
	MediaWikiMainPageEditPage MEditPage = new MediaWikiMainPageEditPage();
	MediaWikiSearchPage search= new MediaWikiSearchPage();
	
	@When("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the(String arg1) throws InterruptedException {
	    search.searchOption.click();
	    Thread.sleep(2);;
	}
	
	

	@When("^I should able to see search input$")
	public void i_should_able_to_see_search_input() {
	   assertTrue(search.inputField.isDisplayed());
	}

	@Then("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) {
	 search.advancedOption.click();
	}
	
	@Then("^I text \"([^\"]*)\"$")
	public void i_text(String arg1) {
	    search.inputField.sendKeys("Details");
	}

	@Then("^uncheck \"([^\"]*)\"$")
	public void uncheck(String arg1) {
	   search.uncheckMain.click();
	}

	@Then("^check \"([^\"]*)\"$")
	public void check(String arg1) {
		search.checkTalk.click();
	}

	@Then("^click Search button$")
	public void click_Search_button() {
	   search.searchOnAdvance.click();
	}
	
	@Then("^I should  be able too see result$")
	public void i_should_be_sble_too_see_result() {
	    assertTrue(search.titleMatches.getText().equals("Page title matches"));
	}
	
	
	@Then("^I click on Everything button$")
	public void i_click_on_Everything_button() {
	    search.everythingOption.click();
	}

	@Then("^I write \"([^\"]*)\"$")
	public void i_write(String argument) {
	   argument="Sele*";
	   search.inputField.sendKeys(argument);
	}

	@Then("^I click on the \"([^\"]*)\" buton$")
	public void i_click_on_the_buton(String arg1) {
	   search.searchOnAdvance.click();
	}

	@Then("^I should be able to see \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_should_be_able_to_see_and(String arg1, String arg2) {
		 assertTrue(search.seleniumRes1.getText().contains("Selenium"));
		assertTrue(search.seleniumRes2.getText().contains("Selenium"));
	}

}
