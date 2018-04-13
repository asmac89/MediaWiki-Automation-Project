package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiMainPageEditPage;
import org.mediawiki.pages.MediaWikiRandomPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RandomPageFunctionalityStepDefs {
	MediaWikiRandomPage randomPage=new MediaWikiRandomPage();
	MediaWikiMainPageEditPage editPage= new MediaWikiMainPageEditPage();

	
	@When("^I click on random page$")
	public void i_click_on_random_page() {
		randomPage.RandomButton.click();
	}

	@Then("^I should see a random page appear$")
	public void i_should_see_a_random_page_appear() {
		randomPage.RandomButton.click();
	}

	@Then("^I click on Random Page again, it should show me a different page instead of displaying the same one$")
	public void i_click_on_Random_Page_again_it_should_show_me_a_different_page_instead_of_displaying_the_same_one() {
		randomPage.RandomButton.click();
	}
	
	
	@Then("^I type text in the edit box$")
	public void i_type_text_in_the_edit_box() {
		randomPage.EditButton.click();
		editPage.MainPageEditInputBox.click();
		editPage.MainPageEditInputBox.sendKeys("Have a good day!");
	}

	@Then("^I click on Save changes button$")
	public void i_click_on_Save_changes_button() {
	editPage.MainPageEditSaveButton.click();
	}


	@Then("^I should see the text that was added to the page displayed on the page and verify it$")
	public void i_should_see_the_text_that_was_added_to_the_page_displayed_on_the_page_and_verify_it() {
	assertTrue(editPage.verifyText.isDisplayed());
	}


}
