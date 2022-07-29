package com.test2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignIn {
public static WebDriver driver;
	
	@FindBy (xpath="//a[@title='Log in to your customer account']")
	private WebElement sign_button;
	
	public WebElement getsign_button()
	{
		return sign_button;
	}
	public SignIn(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
}
