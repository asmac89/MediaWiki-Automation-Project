package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiFilePage {

private WebDriver driver;
	
	public MediaWikiFilePage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Log out']")
	public WebElement logoutLink;
	
	@FindBy(xpath="//a[@title='BLAH.jpg']")
	public WebElement uploadText;
	
	@FindBy(xpath="//td[@dir='ltr']")
	public WebElement commentText;
}
