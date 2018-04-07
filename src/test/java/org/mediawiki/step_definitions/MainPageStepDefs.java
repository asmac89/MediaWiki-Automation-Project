package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;


import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPage;
import org.mediawiki.pages.MediaWikiMainPageEditPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainPageStepDefs {
	MediaWikiMainPage MainPage=new MediaWikiMainPage();
	MediaWikiMainPageEditPage MEditPage=new MediaWikiMainPageEditPage();
	MediaWikiMainPageDiscussionPage DiscussionPage=new MediaWikiMainPageDiscussionPage();
	
	
	@Given("^The Main page is displayed$")
	public void the_Main_page_is_displayed() {
	assertTrue(	MainPage.isAtMainPage()); 
	}

@When("^I click on the Edit tab on main page$")
public void i_click_on_the_Edit_tab_on_main_page() {
    MainPage.MainPageEditButton.click();
}

@Then("^Editing Main Page topic title should be displayed$")
public void editing_Main_Page_topic_title_should_be_displayed() {
  assertTrue( MEditPage.isAtEditPage());
}

@Then("^I click on the Level (\\d+) Headline text button$")
public void i_click_on_the_Level_Headline_text_button_for_Main_page(int arg1) {
  MEditPage.Headline.click();
}

@Then("^I type \"([^\"]*)\"$")
public void i_type(String text) {
    MEditPage.MainPageEditInputBox.sendKeys(text);
}

@Then("^I click on save changes button on edit page$")
public void i_click_on_save_changes_button_on_edit_page() {
   MEditPage.MainPageEditSaveButton.click();
}

@Then("^\"([^\"]*)\" popup should be displayed$")
public void popup_should_be_displayed(String arg1) {
  assertTrue( MainPage.SavedPopup.isDisplayed());
}


@Then("^\"([^\"]*)\" topic should be displayed$")
public void topic_should_be_displayed(String text) {
	  assertTrue(MainPage.Topic.getText().equals(text));

}
@Then("^\"([^\"]*)\" description should be displayed$")
public void description_should_be_displayed(String text) {
  assertTrue(MainPage.Description.getText().contains(text));
}




}
