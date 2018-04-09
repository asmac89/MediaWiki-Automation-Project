package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiWatchlistPage {
	
	private WebDriver driver;

	public MediaWikiWatchlistPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="mw-watchlist-options")
	public WebElement WatchlistOptionsMenue;	
	
	@FindBy(xpath="//div[@class='mw-changeslist-legend mw-collapsible']")
	public WebElement LegendBox;	
	
	@FindBy(id="days")
	public WebElement WatchlistDropDownDays;
	
	@FindBy(xpath="//input[@class='cloption-submit']")
	public WebElement WatchlistShowButton;

	@FindBy(xpath="//span[@class='wlinfo']")
	public WebElement WatchlistTextChanges;
	
	@FindBy(xpath="//a[@class='mw-collapsible-text']")
	public WebElement WatchlistCollapseButton;

	@FindBy(xpath="//div[@class='mw-changeslist-legend mw-collapsible mw-collapsed']")
	public WebElement WatchlistCollapseText;
	
	

}
