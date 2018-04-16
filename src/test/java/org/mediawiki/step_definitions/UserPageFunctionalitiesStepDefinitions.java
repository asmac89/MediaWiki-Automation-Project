package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUserPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserPageFunctionalitiesStepDefinitions {
	MediaWikiMainPage MainPage = new MediaWikiMainPage();
	MediaWikiUserPage UserPage = new MediaWikiUserPage();
	
	
	@Given("^I click on TechNinjas(\\d+) link$")
	public void i_click_on_TechNinjas_link(int arg1) {
    MainPage.techNinjasLink.click();
	}

	@When("^I edit the input box to \"([^\"]*)\"$")
	public void i_edit_the_section_name_to(String arg1) {
	UserPage.inputBox.sendKeys(arg1);
	}


	@Then("^User page should be displayed$")
	public void user_page_should_be_displayed() {
		assertTrue(UserPage.isAtUserPage());
		
    }
	
	@When("^I click on edit tab on User page$")
	public void i_click_on_edit_tab_on_User_page() {
		UserPage.editTab.click();
	}

	@When("^I click on the save button$")
	public void i_click_on_the_save_button() {
		UserPage.saveChanges.click();
	}
	
	@Then("^\"([^\"]*)\" should be displayed on UserPage$")
	public void should_be_displayed_on_UserPage(String arg1) {
		assertTrue(UserPage.description.getText().contains(arg1));
	}


	@Then("^I click on the \"([^\"]*)\" tab$")
	public void i_click_on_the_tab(String arg1) {
		UserPage.history.click();
	}



	@Then("^I see the revision history section and view all the changes made on the application$")
	public void i_see_the_revision_history_section_and_view_all_the_changes_made_on_the_application() {
	assertTrue(UserPage.isAtHistoryPage());
		
	}

	@Then("^I choose the first revision to compare with the default$")
	public void i_choose_the_first_revision_to_compare_with_the_default() {
		UserPage.currentButton.click();
		UserPage.olderButton.click();  
	}

	@When("^I click on the button \"([^\"]*)\"$")
	public void i_click_on_the_button(String arg1) {
		UserPage.compareButton.click();
	}

	@Then("^I should see side by side comparisons and changes that were made to the appllication$")
	public void i_should_see_side_by_side_comparisons_and_changes_that_were_made_to_the_appllication() {
		assertTrue(UserPage.isAtComparePage());
	}

}
