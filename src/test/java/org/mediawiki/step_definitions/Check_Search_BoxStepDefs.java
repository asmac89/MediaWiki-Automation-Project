package org.mediawiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPage;
import org.mediawiki.pages.MediaWikiMainPageEditPage;
import org.mediawiki.pages.MediaWikiSearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Check_Search_BoxStepDefs {
	
	MediaWikiMainPage MainPage = new MediaWikiMainPage();
	MediaWikiMainPageDiscussionPage DiscussionPage = new MediaWikiMainPageDiscussionPage();
	MediaWikiMainPageEditPage MEditPage = new MediaWikiMainPageEditPage();
	MediaWikiSearchPage search= new MediaWikiSearchPage();
	
	@When("^I click on the input box$")
	public void i_click_on_the_input_box() {
		search.searchInput.click();
		
	    
	}

	@Then("^I should be able to type \"([^\"]*)\"$")
	public void i_should_be_able_to_type(String details) {
		details="Details";
		search.searchInput.sendKeys(details); 
	}

	@When("^I click on the Search button$")
	public void i_click_on_the_Search_button() {
		search.searchButton.click();
	}

	@Then("^Details should be displayed$")
	public void details_should_be_displayed() {
		assertTrue(search.details.getText().equals("Details"));   
	}
	
	@Then("^I should see the \"([^\"]*)\" box$")
	public void i_should_see_the_box(String arg1) {
	  assertTrue(search.visitedPagesBox.getAttribute("value").equals("Mark all pages visited"));
	}

	@When("^I click on the Mark all pages visited$")
	public void i_click_on_the_Mark_all_pages_visited() {
	    search.visitedPagesBox.click();
	}

	@When("^\"([^\"]*)\" box should disappear$")
	public void box_should_disappear(String arg1) {
		search.visitedPagesBox.isEnabled();
	   
	}


}
