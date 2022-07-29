package com.sample_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example extends Base_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=getbrowser();
	    maximize();
	getUrl("https://letcode.in/alert");
	
	WebElement simple = driver.findElement(By.id("confirm"));
	click(simple);
	
	AlertHandle("getText");
	AlertHandle ("cancel");
	close();
		
	}

}
