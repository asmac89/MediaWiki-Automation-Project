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
	@FindBy(linkText="Edit")
	public WebElement Edit;
	
	@FindBy(id="TechNinja.27s_How_to_become_a_SDET")
	public WebElement DTopic;
	
	public boolean isAtDiscussionPage() {
		return driver.getTitle().equals("Talk:Main Page - Cybertek's Wiki!");
	}
	
	
	
	
	
	
	
	//mainpage edit page down here:
	
	@FindBy(id="mw-editbutton-headline")
	public WebElement Dheadline;
	
	@FindBy(id="mw-editbutton-link")
	public WebElement internalLink;
	
	public boolean isAtDiscussionEditPage() {
		return driver.getTitle().equals("Editing Talk:Main Page - Cybertek's Wiki!");
	}
	
}
