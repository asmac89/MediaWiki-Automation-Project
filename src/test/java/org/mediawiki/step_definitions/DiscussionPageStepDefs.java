package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPage;
import org.mediawiki.pages.MediaWikiMainPageDiscussionPageEditPage;
import org.mediawiki.pages.MediaWikiMainPageEditPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DiscussionPageStepDefs {
	MediaWikiMainPage MainPage=new MediaWikiMainPage();
	MediaWikiMainPageDiscussionPage DiscussionPage=new MediaWikiMainPageDiscussionPage();
	MediaWikiMainPageDiscussionPageEditPage DEditPage=new MediaWikiMainPageDiscussionPageEditPage();
	MediaWikiMainPageEditPage MEditPage=new MediaWikiMainPageEditPage();


@Then("^Talk:Main Page title should be displayed$")
public void talk_Main_Page_title_should_be_displayed() {
	  assertTrue(DiscussionPage.isAtDiscussionPage());
}

@When("^I click on the Discussion tab on main page$")
public void i_click_on_the_Discussion_tab_on_main_page() {
    MainPage.DiscussionPage.click();
}
@Then("^I click on the Edit tab on discussion page$")
public void i_click_on_the_Edit_tab_on_discussion_page() {
    
}

@Then("^Editing Talk:Main Page title should be displayed$")
public void editing_Talk_Main_Page_title_should_be_displayed() {
    
}


}
	
	
	
	


