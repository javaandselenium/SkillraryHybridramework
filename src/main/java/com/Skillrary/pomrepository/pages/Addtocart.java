package com.Skillrary.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement cart;


public Addtocart(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void addtocartbtn() {
	cart.click();
}

public WebElement getCart() {
	return cart;
}
	
	

}
