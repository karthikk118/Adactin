package com.test2;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class BasePOM {
	
	public static WebDriver driver;

	public static WebDriver getBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\eclipse\\Sample_Project_Practice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
	//	WebDriverWait wait = new WebDriverWait(driver , 20);
		//	WebDriverWait wait = new WebDriverWait(driver , 20);
		return driver;
	}
	public static void page_open(String url)
	{
		driver.get(url);
	}
	
	public static void sendkeys(WebElement element , String value)
	{
		element.sendKeys(value);
	}
	
	
	
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void close()
	{
		driver.close();
	}
	


}
