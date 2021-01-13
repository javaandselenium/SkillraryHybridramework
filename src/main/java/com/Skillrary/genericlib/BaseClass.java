package com.Skillrary.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Bharani
 *
 */
public class BaseClass implements AutoConstant{
	/**
	 * open the application
	 */
	public WebDriver  driver;
	@BeforeMethod
	public void openaopp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(FileUtilies.getdata("URL"));
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	/**
	 * close the applicatiion
	 * @throws IOException 
	 */
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
			Photo.getPhoto(driver, name);
		}
		driver.close();
	}

}
