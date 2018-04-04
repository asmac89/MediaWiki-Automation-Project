package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiUserPage {
	
	private WebDriver driver;
	
	public MediaWikiUserPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="nsfrom")
	public WebElement startingPagesField;
	
	@FindBy(id="nsto")
	public WebElement endingPagesField;
	
	@FindBy(id="namespace")
	public WebElement nameSpaceDropdown;

}
