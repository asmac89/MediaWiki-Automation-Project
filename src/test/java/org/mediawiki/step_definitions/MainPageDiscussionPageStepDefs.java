package org.mediawiki.step_definitions;

import static org.testng.Assert.assertEquals;

import org.mediawiki.pages.MediaWikiLoginPage;
import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUserPage;
import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MainPageDiscussionPageStepDefs {
	
	private WebDriver driver=Driver.getDriver();
	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	MediaWikiUserPage userPage=new MediaWikiUserPage();	
	
	
	@Given("^The Main page is displayed$")
	public void the_Main_page_is_displayed() {
		assertEquals(driver.getTitle().toString(), "Cybertek's Wiki!");
	}

	@Then("^Talk:Main Page title should be displayed$")
	public void talk_Main_Page_title_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click on the Level (\\d+) Headline text button$")
	public void i_click_on_the_Level_Headline_text_button(int arg1) {
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
