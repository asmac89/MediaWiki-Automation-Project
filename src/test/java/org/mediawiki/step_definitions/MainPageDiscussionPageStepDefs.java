package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPageEditPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MainPageDiscussionPageStepDefs {
	MediaWikiMainPage MainPage=new MediaWikiMainPage();
	MediaWikiMainPageDiscussionPage DiscussionPage=new MediaWikiMainPageDiscussionPage();
	MediaWikiMainPageDiscussionPageEditPage DEditPage=new MediaWikiMainPageDiscussionPageEditPage();
	
	
	@Given("^The Main page is displayed$")
	public void the_Main_page_is_displayed() {
	assertTrue(	MainPage.isAtMainPage());
		
	 
	}

	@Then("^Talk:Main Page title should be displayed$")
	public void talk_Main_Page_title_should_be_displayed() {
	  assertTrue(DiscussionPage.isAtDiscussionPage());
	}

	@Then("^I click on the Level (\\d+) Headline text button on Discussion page$")
	public void i_click_on_the_Level_Headline_text_button_on_Discussion_page(int arg1) {
	  
	}

	@Then("^I click on the Level (\\d+) Headline text button for Main page$")
	public void i_click_on_the_Level_Headline_text_button_for_Main_page(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I type \"([^\"]*)\"$")
	public void i_type(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" popup should be displayed$")
	public void popup_should_be_displayed(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^The Main Page is displayed$")
	public void the_Main_Page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click on the internal link button$")
	public void i_click_on_the_internal_link_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" link should be displayed$")
	public void link_should_be_displayed(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" is clickable$")
	public void is_clickable(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Editing Main Page topic title should be displayed$")
	public void editing_Main_Page_topic_title_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I type \"([^\"]*)\" inside the topic input box$")
	public void i_type_inside_the_topic_input_box(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
