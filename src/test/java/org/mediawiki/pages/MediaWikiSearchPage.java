package org.mediawiki.pages;



import java.util.List;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiSearchPage {

private WebDriver driver;
	
	public MediaWikiSearchPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="searchInput")
	public WebElement searchInput;
	
	//@FindBy(id="searchButton")
	public WebElement searchButton;
	
	@FindBy(id="firstHeading")
	public WebElement details;

	
	@FindBy(xpath="//input[@name='mw-watchlist-reset-submit']")
	public WebElement visitedPagesBox;
	
	@FindBy(linkText="Search")
	public WebElement searchOption;

	@FindBy(id="ooui-1")
	public WebElement inputField;
	
	@FindBy(xpath="//button[@class='oo-ui-inputWidget-input oo-ui-buttonElement-button']")
	public WebElement searchOnAdvance;
	
	@FindBy(linkText="Advanced")
	public WebElement advancedOption;
	
	@FindBy(linkText="Everything")
	public WebElement everythingOption;
	
	@FindBy(id="mw-search-ns0")
	public WebElement uncheckMain;
	
	@FindBy(id="mw-search-ns1")
	public WebElement checkTalk;
	
	@FindBy(xpath="//span[@class='mw-headline']")
	public WebElement titleMatches;
	
	
	@FindBy(xpath="(//div[@class='searchresult'])[1]")
	public WebElement seleniumRes1;
	

	@FindBy(xpath="(//div[@class='searchresult'])[2]")
	public WebElement seleniumRes2;
	
	
	
	
}
