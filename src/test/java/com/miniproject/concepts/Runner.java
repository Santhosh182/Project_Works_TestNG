package com.miniproject.concepts;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xslf.model.PropertyFetcher;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Base_Class;
import com.FileReader_manager.File_Reader_Manager;
import com.Page_Object_Manager.PageObjectManager;
import com.configuration_helper.Configuration_Reader;
import com.pom.Booking_confirmation;
import com.pom.Details_Confirmation;
import com.pom.Home_Page;
import com.pom.Logout_Page;
import com.pom.Personal_Details;
import com.pom.Search_Hotel_Details;

public class Runner extends Base_Class{

public static WebDriver driver=browserConfiguration("chrome");
public static PageObjectManager pom = new PageObjectManager(driver);
public static Logger log = Logger.getLogger(Runner.class);
	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		String url = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_url();
		getUrl(url);
		//getUrl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Url Successfully launched");
		// _________________________________**Login Page**_______________________________
		String username = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_username();
		enterInput(pom.get_Instance_Hp().getuser_Name(), username);
		//enterInput(pom.get_Instance_Hp().getuser_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 2, 6));
		String password = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_password();
		enterInput(pom.get_Instance_Hp().getPass_Word(), password);
		//enterInput(pom.get_Instance_Hp().getPass_Word(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 3, 6));
		clickOnElement(pom.get_Instance_Hp().getLogin_Btn());
		log.info("Login Page Credentials Entered");
		// __________________________________**Details**__________________________________
		
		dropDown("bytext", pom.get_Instance_shd().getLocation(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 5, 6));
		dropDown("byindex", pom.get_Instance_shd().getHotel_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 6, 6));
		dropDown("byvalue", pom.get_Instance_shd().getRoom_Type(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 7, 6));
		dropDown("byvalue", pom.get_Instance_shd().getRoom_Nos(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 8, 6));
		enterInput(pom.get_Instance_shd().getDate_Cin(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 9, 6));
		enterInput(pom.get_Instance_shd().getDate_Cout(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 10, 6));
		dropDown("byindex", pom.get_Instance_shd().getAdult_Room(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 11, 6));
		dropDown("byindex", pom.get_Instance_shd().getChild_Room(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 12, 6));
		clickOnElement(pom.get_Instance_shd().getSubmit_Btn());
		log.info("Hotel Details Entered Successfully");
		
		// ____________________________________________**Details Confirmation**__________________________________________________________
		clickOnElement(pom.get_Instance_dc().getRadio_btn());
		clickOnElement(pom.get_Instance_dc().getContinue_Btn());
		log.info("Hotel Confitmation Entered Successfully");
		// _____________________________________________**Personal Details**_________________________________________
		enterInput(pom.get_Instance_pd().getFirst_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 16, 6));
		enterInput(pom.get_Instance_pd().getLast_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 17, 6));
		enterInput(pom.get_Instance_pd().getAddress_Box(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 18, 6));
		enterInput(pom.get_Instance_pd().getCredit_Card(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 19, 6));
		dropDown("byvalue", pom.get_Instance_pd().getCard_Type(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 20, 6));
		dropDown("bytext", pom.get_Instance_pd().getExpiry_Month(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 21, 6));
		dropDown("bytext", pom.get_Instance_pd().getExpiry_Year(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 22, 6));	
		enterInput(pom.get_Instance_pd().getCard_Ccv(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 23, 6));
		clickOnElement(pom.get_Instance_pd().getBooknow_Btn());
		log.info("Personal Details Entered Successfully");
		// ___________________________________________**Booking Confirmation Screenshot**___________________________________________________
			pom.get_Instance_bc().getBooking_Confirm();
		screenSnap("C:\\Users\\Santhosh\\eclipse-workspace\\March22_PB\\Screenshot.png");
		// _________________________________________________**Logout**____________________________________________________________________________
		clickOnElement(pom.get_Instance_lp().getLogout_Btn());
		close();
		log.info("Webpage Successfully Closed");
	}
}
