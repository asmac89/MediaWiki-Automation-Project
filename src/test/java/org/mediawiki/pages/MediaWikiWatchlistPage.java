package org.mediawiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MediaWikiWatchlistPage {

	
	@FindBy(id="mw-watchlist-options")
	public WebElement WatchlistOptionsMenue;	
	
	@FindBy(xpath="//div[@class='mw-changeslist-legend mw-collapsible']")
	public WebElement LegendBox;	
	
	//div[@class='mw-changeslist-legend mw-collapsible']
	@FindBy(id="days")
	public WebElement daysDropDown;
	
	public String selectName() {
		Select list=new Select(daysDropDown);
		 list.selectByVisibleText("1 hour");
		return list.getFirstSelectedOption().getText();
		 
}
}