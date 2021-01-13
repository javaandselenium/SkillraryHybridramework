package com.Skillrary.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author QSP
 *
 */
public class Upcommingclass {
	/**
	 * elements of view all cources
	 */
	@FindBy(xpath="//button[text()='View all Courses']")
	private WebElement viewcources;
	
	
	public Upcommingclass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void viewallcourcesbtn() {
		viewcources.click();
	}

	public WebElement getViewcources() {
		return viewcources;
	}

}
