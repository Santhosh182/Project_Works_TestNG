package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {

	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement logout_Btn;

	public Logout_Page(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}
	
}
