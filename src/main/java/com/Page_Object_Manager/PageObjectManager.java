package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Booking_confirmation;
import com.pom.Click_here_Login;
import com.pom.Details_Confirmation;
import com.pom.Home_Page;
import com.pom.Logout_Page;
import com.pom.Personal_Details;
import com.pom.Search_Hotel_Details;

public class PageObjectManager {
public WebDriver driver;
	
private Home_Page hp;

private Search_Hotel_Details shd;
private Details_Confirmation dc;
private Personal_Details pd;
private Booking_confirmation bc;
private Logout_Page  lp;
private Click_here_Login chp;


public PageObjectManager(WebDriver driver2) {
	// TODO Auto-generated constructor stub
this.driver = driver2;
}

public Home_Page get_Instance_Hp() {
	if (hp==null) {
		hp=new Home_Page(driver);
	}

	return hp;
}
public Search_Hotel_Details get_Instance_shd() {
	// TODO Auto-generated method stub
	if (shd==null) {
		shd=new Search_Hotel_Details(driver);
	}
return shd;
}
public Details_Confirmation get_Instance_dc() {
	if (dc==null) {
		dc=new Details_Confirmation(driver);
	}
return dc;
}

public Personal_Details get_Instance_pd() {
	// TODO Auto-generated method stub
	if (pd==null) {
		pd=new Personal_Details(driver);
	}
return pd;
}
public Booking_confirmation get_Instance_bc() {
	// TODO Auto-generated method stub
	if (bc==null) {
		bc=new Booking_confirmation(driver);
	}
return bc;
}
public Logout_Page get_Instance_lp() {
	// TODO Auto-generated method stub
	if (lp==null) {
		lp=new Logout_Page(driver);
	}
return lp;
}
public Click_here_Login get_instance_chp() {
	// TODO Auto-generated method stub
if (chp==null) {
	chp=new Click_here_Login(driver);

}
return chp;
}
}

