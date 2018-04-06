package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiMainPageDiscussionPage {
private WebDriver driver;
	
	public MediaWikiMainPageDiscussionPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);			
	}
	@FindBy(name="Edit")
	public WebElement Edit;
	
	public boolean isAtDiscussionPage() {
		return driver.getTitle().equals("Talk:Main Page - Cybertek's Wiki!");
	}
	
}
