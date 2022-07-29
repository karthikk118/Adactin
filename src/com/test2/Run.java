package com.test2;


import com.sample_project.Base_Class;

public class Run extends Base_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=getbrowser();
		maximize();
		Wait();
		getUrl("http://automationpractice.com/index.php");
		
		Login l=new Login(driver);
		click(l.getSignInBtn());
		sendkeys(l.getEmailId(),"cool");
		

	}

}
