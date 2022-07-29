package com.sample_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.PageObjectManager;
import com.config.support.FileReaderManager;
import com.pom.LoginPage;
import com.pom.OrderPayment;
import com.pom.PlaceOrder;
import com.pom.SearchOrder;

public class Runnable_Class extends Base_Class {

public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver=getbrowser();
		maximize();
		Wait();
		
		//1.Open URL
		getUrl(FileReaderManager.getInstanceFRM().getInstanceCR().getUrl());
		PageObjectManager pom=new PageObjectManager(driver);
		click(pom.getLoginPage().getSignInBtn());
		
		//2.Login
		sendkeys(pom.getLoginPage().getEmailId(),FileReaderManager.getInstanceFRM().getInstanceCR().getUsername());
		sendkeys(pom.getLoginPage().getPassword(),FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());		
		click(pom.getLoginPage().getLoginBtn());		

		
		//3.Search Order
		click(pom.getSearchOrder().getWomen());
		click(pom.getSearchOrder().getTshirt());
		Frame(0);

		//4.Place Order
		click(pom.getPlaceOrder().getAddtoCart());		
		defaultframe();
		click(pom.getPlaceOrder().getProceed_checkout());
		click(pom.getPlaceOrder().getCheckout());
		click(pom.getPlaceOrder().getProceed_address());
		click(pom.getPlaceOrder().getTerms());
		click(pom.getPlaceOrder().getProceed_Terms());
		
		//5.Payment
		
		click(pom.getOrderPayment().getPayment());
		click(pom.getOrderPayment().getPayment_confirm());
		click(pom.getOrderPayment().getBack_to_Orders());
		
		
		
		
		
		
		
		
		
		
//    driver=getbrowser();
//    maximize();
//getUrl("http://automationpractice.com/index.php");
//
//LoginPage lp=new LoginPage(driver);
//SearchOrder SO=new SearchOrder(driver);
//PlaceOrder PO=new PlaceOrder(driver);
//OrderPayment  OP=new OrderPayment(driver);
//
//Wait();
////screenshot();
//click(lp.getSignInBtn());
//sendkeys(lp.getEmailId(),"coolkarthik118@gmail.com");
//sendkeys(lp.getPassword(),"");
//click(lp.getLoginBtn());
//click(SO.getWomen());
//click(SO.getTshirt());
//
//Frame(0);
//click(PO.getAddtoCart());
//defaultframe();
////
//click(PO.getProceed_checkout());
////
//click(PO.getCheckout());
//click(PO.getProceed_address());
//click(PO.getTerms());
//click(PO.getProceed_Terms());
////
//click(OP.getPayment());
//click(OP.getPayment_confirm());
//click(OP.getBack_to_Orders());

	}

}
