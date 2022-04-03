package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Details {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement first_Name;
	public Personal_Details(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirst_Name() {
		return first_Name;
	}
	
@FindBy(xpath="//input[@id='last_name']")
private WebElement last_Name;
public WebElement getLast_Name() {
	return last_Name;
}

@FindBy(id="address")
private WebElement address_Box;
public WebElement getAddress_Box() {
	return address_Box;
}
@FindBy(xpath="(//input[@type='text'])[13]")
private WebElement credit_Card;
public WebElement getCredit_Card() {
	return credit_Card;
}
@FindBy(xpath="//select[@id='cc_type']")
private WebElement card_Type;
public WebElement getCard_Type() {
	return card_Type;
}
@FindBy(xpath="//select[@id='cc_exp_month']")
private WebElement expiry_Month;
public WebElement getExpiry_Month() {
	return expiry_Month;
}
@FindBy(xpath="//select[@id='cc_exp_year']")
private WebElement expiry_Year;
public WebElement getExpiry_Year() {
	return expiry_Year;
}
@FindBy(xpath="//input[@id='cc_cvv']")
private WebElement card_Ccv;
public WebElement getCard_Ccv() {
	return card_Ccv;
}
@FindBy(xpath="//input[@id='book_now']")
private WebElement booknow_Btn;
public WebElement getBooknow_Btn() {
	return booknow_Btn;
}

}
