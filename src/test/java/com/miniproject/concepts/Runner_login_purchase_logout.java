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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

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

public class Runner_login_purchase_logout extends Base_Class{

public static WebDriver driver=browserConfiguration("chrome");
public static PageObjectManager pom = new PageObjectManager(driver);
public static Logger log = Logger.getLogger(Runner_login_purchase_logout.class);
	//public static void main(String[] args) throws IOException {
			@Test(priority = -5)		
			private void browser_launch() throws IOException {
			// TODO Auto-generated method stub
			PropertyConfigurator.configure("log4j.properties");
			String url = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_url();
			getUrl(url);
			//getUrl("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			log.info("Url Successfully launched");
		}
	
		// _________________________________**Login Page**_______________________________
			@Test(priority = -4)
			private void user_credential() throws IOException {
				// TODO Auto-generated method stub
				String username = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_username();
				enterInput(pom.get_Instance_Hp().getuser_Name(), username);
				//enterInput(pom.get_Instance_Hp().getuser_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 2, 6));
				String password = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_password();
				enterInput(pom.get_Instance_Hp().getPass_Word(), password);
				//enterInput(pom.get_Instance_Hp().getPass_Word(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 3, 6));
				clickOnElement(pom.get_Instance_Hp().getLogin_Btn());
				log.info("Login Page Credentials Entered");
		
			}
			@Test(priority = -3)
		private void webpage_logout() {
			// TODO Auto-generated method stub
		clickOnElement(pom.get_Instance_shd().getLogout_Webpage());
		}
	
	@Test(priority = -2)
	private void click_here_login() {
		// TODO Auto-generated method stub
		clickOnElement(pom.get_instance_chp().getChp());
	}
		// _________________________________**Login Page2**____________________________________
			@Test(priority = -1)
			private void user_credential2() throws IOException {
				// TODO Auto-generated method stub
				String username = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_username();
				enterInput(pom.get_Instance_Hp().getuser_Name(), username);
				//enterInput(pom.get_Instance_Hp().getuser_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 2, 6));
				String password = File_Reader_Manager.get_instance_frm().get_instance_cr().get_config_password();
				enterInput(pom.get_Instance_Hp().getPass_Word(), password);
				//enterInput(pom.get_Instance_Hp().getPass_Word(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 3, 6));
				clickOnElement(pom.get_Instance_Hp().getLogin_Btn());
				log.info("Login Page Credentials Entered");
			}	
			
			// __________________________________**Details**__________________________________
		@Test(priority = 0)
		private void hotel_booking() throws IOException {
			// TODO Auto-generated method stub
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
		}
		
		
		// ____________________________________________**Details Confirmation**__________________________________________________________
		@Test(priority = 1)
		private void conforming_Page() {
			// TODO Auto-generated method stub
			clickOnElement(pom.get_Instance_dc().getRadio_btn());
			clickOnElement(pom.get_Instance_dc().getContinue_Btn());
			log.info("Hotel Confitmation Entered Successfully");
		}	
		// _____________________________________________**Personal Details**_________________________________________
		@Test(priority = 2)
		private void personal_Information() throws IOException {
			enterInput(pom.get_Instance_pd().getFirst_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 16, 6));
			enterInput(pom.get_Instance_pd().getLast_Name(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 17, 6));
			enterInput(pom.get_Instance_pd().getAddress_Box(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 18, 6));
			enterInput(pom.get_Instance_pd().getCredit_Card(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 19, 6));
			dropDown("byvalue", pom.get_Instance_pd().getCard_Type(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 20, 6));
			dropDown("bytext", pom.get_Instance_pd().getExpiry_Month(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 21, 6));
			dropDown("bytext", pom.get_Instance_pd().getExpiry_Year(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 22, 6));	
			enterInput(pom.get_Instance_pd().getCard_Ccv(), get_Particular_data("F:\\JAVA Programing\\Project Class\\Test Cases.xlsx", "Adactin Practice", 23, 6));
			clickOnElement(pom.get_Instance_pd().getBooknow_Btn());
			log.info("Personal Details Entered Successfully");	// TODO Auto-generated method stub
		}
		
		// ___________________________________________**Booking Confirmation Screenshot**___________________________________________________
		@Ignore
		@Test(priority = 0)
		private void screenshot() throws IOException {
			// TODO Auto-generated method stub
			pom.get_Instance_bc().getBooking_Confirm();
			screenSnap("C:\\Users\\Santhosh\\eclipse-workspace\\March22_PB\\Screenshot.png");
		}
		
		// _________________________________________________**Logout**____________________________________________________________________________
		@Test(priority = 3)
		private void final_logout() {
			clickOnElement(pom.get_Instance_lp().getLogout_Btn());
			close();
			log.info("Webpage Successfully Closed");// TODO Auto-generated method stub

		}
		
	}


