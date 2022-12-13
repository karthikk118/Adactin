package com.pom;

public class Logout {
// Same as Order Page
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement payment;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement payment_confirm;
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement Back_to_Orders;

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getPayment_confirm() {
		return payment_confirm;
	}

	public WebElement getBack_to_Orders() {
		return Back_to_Orders;
	}

	public OrderPayment(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver, this);

}
