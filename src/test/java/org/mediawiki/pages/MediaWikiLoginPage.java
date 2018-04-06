package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiLoginPage {
	
	private WebDriver driver;

	public MediaWikiLoginPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@accesskey='o']")
	public WebElement loginLink;
	
	@FindBy(id="wpName1")
	public WebElement username;
	
	@FindBy(id="wpPassword1")
	public WebElement password;
	
	@FindBy(id="wpLoginAttempt")
	public WebElement loginButton;
	
	public void login(String userName, String pwd) {
		loginLink.click();
		username.clear();
		username.sendKeys(userName);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
