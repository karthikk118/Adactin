package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginPage;

public class Login {

	public static  WebDriver driver;

	@FindBy (xpath="//a[@title='Log in to your customer account']")
	private WebElement signInBtn;

	@FindBy (id="email")
	private WebElement emailId;

	
	public Login(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	Login.driver=driver2;
	PageFactory.initElements(driver, this);

	}




}
