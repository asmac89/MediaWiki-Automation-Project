package org.mediawiki.step_definitions;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.mediawiki.pages.MediaWikiFilePage;
import org.mediawiki.pages.MediaWikiLoginPage;
import org.mediawiki.pages.MediaWikiMainPage;
import org.mediawiki.pages.MediaWikiUploadFilePage;
import org.mediawiki.utilities.BrowserUtils;
import org.mediawiki.utilities.ConfigurationReader;
import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UploadFileFunctionalityStepDefs {

	private WebDriver driver=Driver.getDriver();
	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	MediaWikiUploadFilePage uploadPage=new MediaWikiUploadFilePage();
	MediaWikiFilePage filePage=new MediaWikiFilePage();

	
	@When("^I click on Upload File$")
	public void I_click_on_Upload_File() {
		mainPage.UploadFileButton.click();

	}

	@Then("^I click on Choose File$")
	public void I_click_on_Choose_File() {
	 uploadPage.ChooseFileButton.click();
	}

	@When("^I upload a file with valid data$")
	public void I_upload_a_file_with_valid_data() {
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/org/mediawiki/resources/data/OKAY.jpg";	
		uploadPage.ChooseFileButton.sendKeys(filePath);
	}

	@Then("^The uploaded file should be displayed automatically in Destination filename$")
	public void The_uploaded_file_should_be_displayed_automatically_in_Destination_filename() {
		assertTrue(uploadPage.DestinationFile.isDisplayed());
 
	}

	@Then("^I scroll the page down$")
	public void I_scroll_the_page_down() {
	   Actions action=new Actions(driver);
	   BrowserUtils.scrollDown();
	   
	}

	@Then("^select Ignore any warnings checkbox$")
	public void select_Ignore_any_warnings_checkbox() {
	 uploadPage.IgnoreWarningsCheckBox.click();
	}

	
	@Then("^verify that Watch this file checkbox should be checked by default$")
	public void verify_that_watch_this_file_checkbox_should_be_checked_by_default() {
		assertTrue(uploadPage.Checkbox.isSelected());
}

	@Then("^I click on Upload button$")
	public void i_click_on_Upload_button() {
		uploadPage.uploadButton.click();
	}


	@And("^you should see the uploaded file on the file page by verifying text of the file$")
	public void you_should_see_the_uploaded_file_on_the_file_page_by_verifying_text_of_the_file() {
		assertTrue(filePage.uploadText.isDisplayed());
	}
	
	@Then("^type text in the summary box$")
	public void type_text_in_the_summary_box() {
	uploadPage.summaryText.sendKeys("Type");
	}


	@Then("^verify the text is displayed in the File History section under the comment column on File Page$")
	public void verify_the_text_is_displayed_in_the_File_History_section_under_the_comment_column_on_File_Page() {
	   assertTrue(filePage.commentText.isDisplayed());
	}
	
	
}
