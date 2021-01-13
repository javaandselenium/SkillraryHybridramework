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
public class SkillraryLive {
	/**
	 * elements of skillrary live page
	 */
	@FindBy(xpath="//a[text()='May be later']")
	private WebElement maybelater;
	
	@FindBy(xpath="//a[text()='Upcoming Classes']")
	private WebElement upcommingclass;
	
	public SkillraryLive(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void classes() {
		maybelater.click();
		upcommingclass.click();
	}

	public WebElement getMaybelater() {
		return maybelater;
	}

	public WebElement getUpcommingclass() {
		return upcommingclass;
	}

}
