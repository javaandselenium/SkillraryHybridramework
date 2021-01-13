package com.Skillrary.testscripts;

import java.util.Set;

import org.testng.annotations.Test;

import com.Skillrary.genericlib.BaseClass;
import com.Skillrary.pomrepository.pages.Login;
import com.Skillrary.pomrepository.pages.SkillraryLive;
import com.Skillrary.pomrepository.pages.Upcommingclass;

public class ViewAllcources extends BaseClass{
@Test
public void viewallcources() {
	Login l=new Login(driver);
	l.servicebtn();
	Set<String> child = driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
		
	}
	SkillraryLive s=new SkillraryLive(driver);
	s.classes();
	Upcommingclass u=new Upcommingclass(driver);
	u.viewallcourcesbtn();
	
	
}
}
