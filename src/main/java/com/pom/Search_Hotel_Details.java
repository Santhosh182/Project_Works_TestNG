package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Details {

	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location_Name;

	public Search_Hotel_Details(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location_Name;
	}
	
	@FindBy(id="hotels")
	private WebElement hotel_Name;

	public WebElement getHotel_Name() {
		return hotel_Name;
	}
	
@FindBy(xpath="//select[@id='room_type']")
private WebElement room_Type;

public WebElement getRoom_Type() {
	return room_Type;
}
@FindBy(xpath="//select[@id='room_nos']")
private WebElement room_Nos;

public WebElement getRoom_Nos() {
	return room_Nos;
}
@FindBy(xpath="//input[@id='datepick_in']")
private WebElement date_Cin;
public WebElement getDate_Cin() {
	return date_Cin;
}

@FindBy(xpath="//input[@id='datepick_out']")
private WebElement date_Cout;
public WebElement getDate_Cout() {
	return date_Cout;
}

@FindBy(id="adult_room")
private WebElement adult_Room;
public WebElement getAdult_Room() {
	return adult_Room;
}

@FindBy(xpath="//select[@id='child_room']")
private WebElement child_Room;
public WebElement getChild_Room() {
	return child_Room;
}

@FindBy(id="Submit")
private WebElement submit_Btn;
public WebElement getSubmit_Btn() {
	return submit_Btn;
}
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout_Webpage;

public WebElement getLogout_Webpage() {
	return logout_Webpage;
}
}
