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
	
	@FindBy(xpath="//a[@accesskey='q']")
	public WebElement specialPagesLink;
	
	@FindBy(xpath="//a[@title='Special:AllPages']")
	public WebElement allPagesLink;
	
	@FindBy(linkText="Edit")
	public WebElement MainPageEditButton;
	
	@FindBy(linkText="Read")
	public WebElement MainPageReadButton;
	
	@FindBy(name="wpTextbox1")
	public WebElement MainPageEditInputBox;
	
	@FindBy(name="wpSave")
	public WebElement MainPageSaveButton;
	

}
