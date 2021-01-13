package com.Skillrary.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.Skillrary.genericlib.BaseClass;
import com.Skillrary.genericlib.FileUtilies;
import com.Skillrary.genericlib.Utilies;
import com.Skillrary.pomrepository.pages.Addtocart;
import com.Skillrary.pomrepository.pages.Demoapp;
import com.Skillrary.pomrepository.pages.Login;
import com.Skillrary.pomrepository.pages.Testing;

public class Addtocarttc2 extends BaseClass{
	@Test
	public void addtocarttc2() throws FileNotFoundException, IOException, InterruptedException {
		Login l=new Login(driver);
		Thread.sleep(3000);
		l.gerasbtn();
		Set<String> child = driver.getWindowHandles();
		for(String c:child) {
			driver.switchTo().window(c);
		}
		Demoapp d=new Demoapp(driver);
		Utilies.dropDown(d.getCoursedd(),FileUtilies.getdata("coursedd"));
		Testing t=new Testing(driver);
		t.cucmbercourse();
		Addtocart c=new Addtocart(driver);
		c.addtocartbtn();
		Utilies.alertpopup(driver);
	}

}
