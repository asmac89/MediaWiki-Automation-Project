package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiUploadFilePage {

	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	
	private WebDriver driver;
	
	public MediaWikiUploadFilePage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="wpUploadFile")
	public WebElement ChooseFileButton;
	
	@FindBy(id="wpDestFile")
	public WebElement DestinationFile;
	
	@FindBy(name="wpWatchthis")
	public WebElement Checkbox;

	@FindBy(name="wpUpload")
	public WebElement uploadButton;
	
	@FindBy(id="wpUploadDescription")
	public WebElement summaryText;

	@FindBy(name="wpIgnoreWarning")
	public WebElement IgnoreWarningsCheckBox;
;

}
