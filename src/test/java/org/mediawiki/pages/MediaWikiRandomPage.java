package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiRandomPage {

	MediaWikiLoginPage loginPage=new MediaWikiLoginPage();
	MediaWikiMainPage mainPage=new MediaWikiMainPage();
	
	private WebDriver driver;
	
	public MediaWikiRandomPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="n-randompage")
	public WebElement RandomButton;
	
	@FindBy(xpath="//a[@title='Edit this page']")
	public WebElement EditButton;
	
	@FindBy(xpath="//div[@class='mw-body']")
	public WebElement SavedPage;
	
}
