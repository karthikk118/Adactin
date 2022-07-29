package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signInBtn;

	@FindBy(id = "email")
	private WebElement emailId;

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement LoginBtn;

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		LoginPage.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
