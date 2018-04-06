package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiMainPage {
	
	private WebDriver driver;
	
	public MediaWikiMainPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Special pages")
	public WebElement specialPagesLink;
	
	@FindBy(linkText="All pages")
	public WebElement allPagesLink;
	
	@FindBy(linkText="Edit")
	public WebElement MainPageEditButton;
	
	@FindBy(linkText="Read")
	public WebElement MainPageReadButton;
	
	@FindBy(id="mw-editbutton-headline")
	public WebElement MainPageHeadline;

	@FindBy(linkText="Techninjas7")
	public WebElement techNinjasLink;

	@FindBy(xpath="//div[contains(text(),'Your edit was')]")
	public WebElement SavedPopup;
	
	@FindBy(xpath="//span[@id='TechNinja.27s_Topic']")
	public WebElement Topic;
	
	@FindBy(xpath="//div[@class='mw-parser-output']//p")
	public WebElement Description;
	
	public boolean isAtMainPage() {
		return driver.getTitle().equals("Cybertek's Wiki!");
	}
	
	public void CatchAlert() {
		Alert alert=driver.switchTo().alert();
	}
	
	
	

}
