package com.Skillrary.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Bharani
 *
 */
public class FileUtilies implements AutoConstant{
	/**
	 * To read the data from property file
	 * @param enterthekey
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getdata(String enterthekey) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propetyfilepath));
		String value1 = p.getProperty(enterthekey);
		return value1;
	}

}
