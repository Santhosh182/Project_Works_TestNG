package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_here_Login{
	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement chp;
	public Click_here_Login(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}
	public WebElement getChp() {
		return chp;
	}

}