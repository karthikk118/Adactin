package com.test2;
import org.openqa.selenium.WebDriver;
import java.io.IOException;



public class Runnable extends BasePOM{

	public static WebDriver driver;

	public static void main(String[] args)throws IOException
	{
	driver = getBrowser();
	page_open("http://automationpractice.com/index.php");

	SignIn si = new SignIn(driver);
	Login_Page lp = new Login_Page(driver);
	//wait();

	click(si.getsign_button());
	sendkeys(lp.getMailid(), "mahakumar1999k@gmail.com");
	sendkeys(lp.getPassword(), "Maha*0512$");
	click(lp.getLogin_button());
	close();
	}

}
