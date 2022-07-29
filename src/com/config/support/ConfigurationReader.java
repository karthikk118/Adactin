package com.config.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public Properties p;
	public ConfigurationReader() throws IOException
	{
	
	File f=new File ("C:\\Users\\Windows\\eclipse\\Sample_Project_Practice\\src\\com\\config\\property\\configuation.properties");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
		public String getUrl()
		{
			String url=p.getProperty("url");
			return url;
		}
	
		public String getUsername()
		{
			String username=p.getProperty("username");
			return username;
		}
		
		public String getPassword()
		{
			String password=p.getProperty("password");
			return password;
			
		}
	
}
