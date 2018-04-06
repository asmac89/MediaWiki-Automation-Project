package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
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
	
	public boolean isAtMainPage() {
		return driver.getTitle().equals("Cybertek's Wiki!");
	}
	
	
	

}
