package com.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;
	 


	@FindBy (id="email")
	private WebElement mailid;

	@FindBy (id="passwd")
	private WebElement password;

	@FindBy (id="SubmitLogin")
	private WebElement Login_button;






	public Login_Page(WebDriver driver2) 
	{
		Login_Page.driver = driver2;
		PageFactory.initElements(driver,this);
		
	}



	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		
		return Login_button;

}

}