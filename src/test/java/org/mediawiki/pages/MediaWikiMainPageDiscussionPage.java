package org.mediawiki.pages;

import org.mediawiki.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaWikiMainPageDiscussionPage {
private WebDriver driver;
	
	public MediaWikiMainPageDiscussionPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);			
	}
	@FindBy(linkText="Edit")
	public WebElement Edit;
	
	@FindBy(id="TechNinja.27s_How_to_become_a_SDET")
	public WebElement DTopic;
	
	
	public WebElement isLinkDisplayed(String name) {
		return driver.findElement(By.linkText(name));
	
	}
	public  boolean isClickable(String el){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(el))));
			return true;
		}
		catch (Exception e){
			return false ;
		}
	}
	
	public boolean isAtDiscussionPage() {
		return driver.getTitle().equals("Talk:Main Page - Cybertek's Wiki!");
	}
	
	
	
	
	
	
	
	//mainpage edit page down here:
	
	@FindBy(id="mw-editbutton-headline")
	public WebElement Dheadline;
	
	@FindBy(id="mw-editbutton-link")
	public WebElement internalLink;
	
	public boolean isAtDiscussionEditPage() {
		return driver.getTitle().equals("Editing Talk:Main Page - Cybertek's Wiki!");
	}
	
}
