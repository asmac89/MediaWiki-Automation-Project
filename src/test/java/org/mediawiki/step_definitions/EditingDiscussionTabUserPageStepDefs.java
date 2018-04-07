package org.mediawiki.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mediawiki.pages.MediaWikiLoginPage;
import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUserPage;
import org.mediawiki.pages.MediaWikiUserPageDiscussion;
import org.mediawiki.utilities.BrowserUtils;
import org.mediawiki.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditingDiscussionTabUserPageStepDefs {
	
	private WebDriver driver=Driver.getDriver();
	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	MediaWikiUserPage userPage=new MediaWikiUserPage();
	MediaWikiUserPageDiscussion userPageDiscussion=new  MediaWikiUserPageDiscussion();
	
//	Map<String,String> createDiscussionTabsMap=new HashMap<>();
//	Map<String,String> overviewTaskMap=new HashMap<>();
	
	@Given("^that I see the User page displayed$")
	public void that_I_see_the_User_page_displayed() {
	    mainPage.techNinjasLink.click();
	    assertTrue(driver.getTitle().contains("User"));
	}

	@When("^I click on the Discussion tab$")
	public void i_click_on_the_Discussion_tab() {
	    userPage.discussionTab.click();
	    
	}

	@Then("^I should see the Read, Edit, Add topic, View history and Unwatch tabs$")
	public void i_should_see_the_Discussion_tabs(DataTable discussionTabs) {
	    List<WebElement> discussTabs=driver.findElements(By.xpath("//div[@id='p-views']//li"));
	    for(WebElement e:discussTabs) {
	    		assertTrue(e.isDisplayed());
	    }
	}

	@When("^I click on the Edit tab$")
	public void i_click_on_the_Edit_tab() {
	    userPageDiscussion.clickOnEdit();
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) {
	    assertTrue(userPageDiscussion.heading.getText().equals("Editing User talk:Techninjas7"));
	}

	@Then("^I should be able to type any string \"([^\"]*)\" characters in the text field below$")
	public void i_should_be_able_to_type_any_characters_in_the_text_field_below(String string) {
	    userPageDiscussion.textbox.sendKeys(string);
	}

	@Then("^I click on save changes button$")
	public void i_click_on_save_changes_button() {
	    userPageDiscussion.saveButton.click();
	}

	@Then("^what ever I had typed previously should be displayed on the newly loaded Discussion page$")
	public void what_ever_I_had_typed_previously_should_be_displayed_on_the_newly_loaded_Discussion_page() {
	    assertTrue(userPageDiscussion.savedTextBox.getText().contains("Asma is testing to see if this really works"));
	}

}
