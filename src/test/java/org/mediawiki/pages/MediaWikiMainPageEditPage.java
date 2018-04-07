package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiMainPageEditPage {
private WebDriver driver;
	
	public MediaWikiMainPageEditPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="wpTextbox1")
	public WebElement MainPageEditInputBox;
	
	@FindBy(name="wpSave")
	public WebElement MainPageEditSaveButton;
	
	@FindBy(id="mw-editbutton-headline")
	public WebElement Headline;
	
	public boolean isAtEditPage() {
		return driver.getTitle().equals("Editing Main Page - Cybertek's Wiki!");
	}
	
	public void CatchAlert() {
		Alert alert=driver.switchTo().alert();
	}
	
	
}
