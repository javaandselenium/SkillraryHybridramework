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
public class Takecourse {
	/**
	 * Elements of takecourse
	 */
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takecourse;
	
	public Takecourse(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void takethiscourse() {
		takecourse.click();
	}

	public WebElement getTakecourse() {
		return takecourse;
	}

}
