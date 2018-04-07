package org.mediawiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MediaWikiWatchlistPage {

	
	@FindBy(id="mw-watchlist-options")
	public WebElement WatchlistOptionsMenue;	
	
	@FindBy(xpath="//div[@class='mw-changeslist-legend mw-collapsible']")
	public WebElement LegendBox;	
	
	//div[@class='mw-changeslist-legend mw-collapsible']
}
