package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirmation {

	public WebDriver driver;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement booking_Confirm;

	public Booking_confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getBooking_Confirm() {
		return booking_Confirm;
	}
	
}
