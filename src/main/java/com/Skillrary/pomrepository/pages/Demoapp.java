package com.Skillrary.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoapp {
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public Demoapp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursedd() {
		return coursedd;
	}
	
	


}
