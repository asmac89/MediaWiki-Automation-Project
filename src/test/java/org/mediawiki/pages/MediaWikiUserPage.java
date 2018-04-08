package org.mediawiki.pages;

import java.util.List;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//input[@class='mw-htmlform-submit']")
	public WebElement goButton;
	
	@FindBy(xpath="//div[@class='mw-allpages-body']//li")
	public WebElement searchResults;
	
	@FindBy(xpath="//a[@title='Log out']")
	public WebElement logoutLink;
	
	@FindBy(linkText="Discussion")
	public WebElement discussionTab;
	
	@FindBy(xpath="//div[@id='p-views']//li")
	public WebElement discussionTabs;
	
	@FindBy(linkText="Edit")
	public WebElement editTab;
	
	@FindBy(id="wpTextbox1")
	public WebElement inputBox;
	
	@FindBy(id="wpSave")
	public WebElement saveChanges;
	
	@FindBy(xpath="//div[@class='mw-parser-output']//p")
	public WebElement description;
	
	
	public boolean isAtUserPage() {
		return driver.getTitle().equals("User:Techninjas7 - Cybertek's Wiki!");
	}
	
	
	
	
}
