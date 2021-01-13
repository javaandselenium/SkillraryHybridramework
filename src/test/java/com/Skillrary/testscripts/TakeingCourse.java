package com.Skillrary.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Skillrary.genericlib.BaseClass;
import com.Skillrary.genericlib.FileUtilies;
import com.Skillrary.genericlib.Utilies;
import com.Skillrary.pomrepository.pages.DataScience;
import com.Skillrary.pomrepository.pages.Home;
import com.Skillrary.pomrepository.pages.Login;
import com.Skillrary.pomrepository.pages.Takecourse;

public class TakeingCourse extends BaseClass {
	@Test
	public void takecoursetc1() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.serachforcource(FileUtilies.getdata("coursename"));
		Home h=new Home(driver);
		Utilies.mouseHover(driver,h.getDevelopment());
		h.selectoption();
		DataScience d=new DataScience(driver);
		d.datscience();
		Takecourse c=new Takecourse(driver);
		c.takethiscourse();
		
		
	}

}
