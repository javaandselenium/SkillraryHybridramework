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

public class Login {
	/**
	 * store the elements address for loginpage
	 */
	@FindBy(name = "q")
	private WebElement serachtb;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement serachbtn;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gears;
	
	@FindBy(xpath="(//a[@href='https://demoapp.skillrary.com'])[2]")
	private WebElement demoapp;
	
	@FindBy(xpath="//a[text()=' SERVICES ']")
	private WebElement services;
	
	@FindBy(xpath="//a[text()=' Skillrary Live']")
	private WebElement skillrarylivebtn;

	public WebElement getServices() {
		return services;
	}

	public WebElement getSkillrarylivebtn() {
		return skillrarylivebtn;
	}

	public WebElement getDemoapp() {
		return demoapp;
	}

	public WebElement getGears() {
		return gears;
	}

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void serachforcource(String coursename) {
		serachtb.sendKeys(coursename);
		serachbtn.click();
	}

	public WebElement getSerachtb() {
		return serachtb;
	}
	
	public void gerasbtn() {
		gears.click();
		demoapp.click();
	}

	public WebElement getSerachbtn() {
		return serachbtn;
	}
	
	public void servicebtn() {
		services.click();
		skillrarylivebtn.click();
	}

}
