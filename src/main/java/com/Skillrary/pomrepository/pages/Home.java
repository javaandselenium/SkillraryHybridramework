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
public class Home {
	/**
	 * Elements from home page
	 */
	@FindBy(xpath="//span[text()='Development']")
	private WebElement development;
	
	@FindBy(linkText="Data Science")
	private WebElement datascience;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void selectoption() {
		datascience.click();
	}

	public WebElement getDevelopment() {
		return development;
	}

	public WebElement getDatascience() {
		return datascience;
	}


}
