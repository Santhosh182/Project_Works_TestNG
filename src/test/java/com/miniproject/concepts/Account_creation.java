package com.miniproject.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\eclipse-workspace\\Mini_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign')]"));
		signInButton.click();
		WebElement emailAddressTextBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		emailAddressTextBox.sendKeys("sansandy182@gmail.com");
		WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
		createAccountButton.click();
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radiobutton.click();
		WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstNameTextBox.sendKeys("San");
		WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastNameTextBox.sendKeys("Sandy");
		WebElement passwordTextBox = driver.findElement(By.id("passwd"));
		passwordTextBox.sendKeys("sansandy");
		WebElement dateDropDown = driver.findElement(By.id("days"));
		Select s1 = new Select(dateDropDown);
		s1.selectByValue("1");
		WebElement monthDropDown = driver.findElement(By.id("months"));
		Select s2 = new Select(monthDropDown);
		s2.selectByValue("1");
		WebElement yearDropDown = driver.findElement(By.id("years"));
		Select s3 = new Select(yearDropDown);
		s3.selectByValue("2001");
		WebElement firstNameAddressBox = driver.findElement(By.id("firstname"));
		firstNameAddressBox.sendKeys("san");
		WebElement lastNameAddressBox = driver.findElement(By.id("lastname"));
		lastNameAddressBox.sendKeys("sandy");
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("great");
		WebElement addressTextBox = driver.findElement(By.id("address1"));
		addressTextBox.sendKeys("420, Dubai Street, Dubai main Road, Dubai");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("America");
		WebElement stateDropDown = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s4 = new Select(stateDropDown);
		s4.selectByValue("2");
		WebElement zipCodeTextBox = driver.findElement(By.id("postcode"));
		zipCodeTextBox.sendKeys("20001");
		WebElement mobileNoTextBox = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobileNoTextBox.sendKeys("1234567890");
		WebElement registerButton = driver.findElement(By.id("submitAccount"));
		registerButton.click();
	}
}
