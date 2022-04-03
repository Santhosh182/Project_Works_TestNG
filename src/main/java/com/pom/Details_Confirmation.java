package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details_Confirmation {

	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio_btn;

	public Details_Confirmation(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}
	@FindBy(id="continue")
	private WebElement continue_Btn;

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
	
}
