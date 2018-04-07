package org.mediawiki.pages;

import java.util.List;

import org.mediawiki.utilities.BrowserUtils;
import org.mediawiki.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaWikiUserPageDiscussion {
	
	private WebDriver driver;
	
	public MediaWikiUserPageDiscussion() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(id="firstHeading")
	public WebElement heading;
	
	@FindBy(id="wpTextbox1")
	public WebElement textbox;
	
	@FindBy(id="wpSave")
	public WebElement saveButton;
	
	@FindBy(id="mw-content-text")
	public WebElement savedTextBox;
	
	@FindBy(id="wpSummary")
	public WebElement subjectField;
	
	public void clickOnEdit() {
		List<WebElement> discussTabs=driver.findElements(By.xpath("//div[@id='p-views']//li"));
		for(WebElement e:discussTabs) {
			if(e.getText().equals("Edit")) {
				e.click();
				break;
			}
		}
	}
	
	public void clickOnAddTopic() {
		List<WebElement> discussTabs=driver.findElements(By.xpath("//div[@id='p-views']//li"));
		for(WebElement e:discussTabs) {
			if(e.getText().equals("Add topic")) {
				e.click();
				break;
			}
		}
	}
}
