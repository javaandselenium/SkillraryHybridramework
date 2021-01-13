package com.Skillrary.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	@FindBy(xpath="(//a[text()='Cucumber'])[2]")
	private WebElement cucmber;
	
	
	public Testing(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	
	public void cucmbercourse() {
		cucmber.click();
	}

	public WebElement getCucmber() {
		return cucmber;
	}

}
