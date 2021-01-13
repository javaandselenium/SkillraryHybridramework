package com.Skillrary.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author Bharani
 *
 */
public class Utilies {
	/**
	 * To handle the dropdown
	 * @param ele
	 * @param text
	 */
	
	public static void dropDown(WebElement ele,String text) {
		
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * Handle the mousehover
	 * @param driver
	 * @param ele
	 */
	
	public static void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/**
	 * Handle the alertpopup
	 * @param driver
	 */
	
	public static void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * Handle the scrollbar
	 * @param driver
	 */
	
	public static void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	

}
