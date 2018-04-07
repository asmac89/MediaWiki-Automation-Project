package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiMainPageDiscussionPageEditPage {
private WebDriver driver;
	
	public MediaWikiMainPageDiscussionPageEditPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);			
	}
	

	
	

}
