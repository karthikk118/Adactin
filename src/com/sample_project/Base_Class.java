package com.sample_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
public static WebDriver driver;

	public static WebDriver getbrowser ()
	{
   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\eclipse\\Sample_Project_Practice\\Driver\\chromedriver.exe");
		return driver=new ChromeDriver();
		
		
	}
	public static void close()
	{
		
	driver.close();
	}
	
	public static void getUrl(String url)
	{
		
		driver.get(url);
	}
	
	public static void navigateTo(String url)
	{
		driver.navigate().to(url);
	}
	public static void back()
	{
		driver.navigate().back();
	}
	public static void forward()
	{
		driver.navigate().forward();
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}

	public  static void quit()
	{
		driver.quit();
	}
	
	public static void sendkeys(WebElement element,String value)
	{
	  element.sendKeys(value);
	}
	
	public static void click(WebElement element)
	{
	 element.click();
	}
	
	public static void clear(WebElement element)
	{
		element.click();
	}
	public static void getText(WebElement element)
	{
		System.out.println(element.getText());
	}
	
	public static  void isdisplayed(WebElement element)
	{
		System.out.println(element.isDisplayed());
	}
	public static void isEnabaled(WebElement element)
	{
		System.out.println(element.isEnabled());
	}
	
	//Alert
	
	public static void AlertHandle(String options)
	{
		Alert alert =driver.switchTo().alert();
		if(options.equalsIgnoreCase("ok"))
		{
			alert.accept();
		}
		else if (options.equalsIgnoreCase("cancel"))
		{
			alert.dismiss();
		}
		
		else if (options.equalsIgnoreCase("getText"))
		{
			System.out.println(alert.getText());
		}
	}
		
//Single Drop down
		public static void singleDropdown(WebElement element, String options, String input)
		{
			Select s=new Select (element);
			
			if (options.equalsIgnoreCase("value"))
				s.selectByValue(input);
			else if (options.equalsIgnoreCase("text"))
				s.selectByVisibleText(input);
			else if (options.equalsIgnoreCase("Index"))
			{
				int parseInt = Integer.parseInt(input);
				System.out.println(parseInt);
			}
			
		}
		
// Single Drop down-End
		
		public static void draganddrop(WebElement src,WebElement target)
		{
			Actions act=new Actions (driver);
			act.dragAndDrop(src, target).build().perform();
		}

		//Robot
		
		public static void robot(String options) throws AWTException
		{
			Robot r=new Robot();
			
			if (options.equalsIgnoreCase("down"))
			{
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			else if (options.equalsIgnoreCase("Up"))
			{
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
			}
			else if (options.equalsIgnoreCase("Enter"))
			{
			r.keyPress(KeyEvent.VK_ENTER);
			}
			
		}
		
		public static void getattribute(WebElement element)
		{
			
			String attribute=element.getAttribute("Value");
			System.out.println(attribute);
		}
		
		public static void getattributename(WebElement element)
		{
			String a=element.getAttribute("name");
			System.out.println(a);
		}

		public static void defaultcontent()
		{
			driver.switchTo().defaultContent();
		}
		
		public static void Wait ()
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public static void Frame(int i)
		{
			driver.switchTo().frame(i);
		}
		
		public static void defaultframe()
		{
			driver.switchTo().defaultContent();
			
		}
		public static void maximize()
		{
			driver.manage().window().maximize();
		}
		
		public static void screenshot() throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Windows\\eclipse\\Sample_Project_Practice\\Snap//snap.png");
			
			FileUtils.copyFile(src, dest);
			
		}
		
		
		
//		public static void WindowHandle()
		
}


