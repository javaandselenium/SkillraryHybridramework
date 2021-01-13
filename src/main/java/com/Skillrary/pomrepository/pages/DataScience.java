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
public class DataScience {
	/**
	 * Elements of datascience
	 */
	@FindBy(xpath="//a[contains(text(),' Deep Learning')]")
	private WebElement coursename;
	
	public DataScience(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void datscience() {
		coursename.click();
	}

	public WebElement getCoursename() {
		return coursename;
	}
}
