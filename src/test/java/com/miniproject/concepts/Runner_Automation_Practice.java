package com.miniproject.concepts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Runner_Automation_Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhosh\\eclipse-workspace\\Mini_Project\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//_________________________________________________Sign In Functionality__________________________________________________
		WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign')]"));
		signInButton.click();
//_________________________________________________Login Functionality_____________________________________________________
		WebElement emailAddressBox = driver.findElement(By.id("email"));
		emailAddressBox.sendKeys("sansandy@gmail.com");
		WebElement passwordTextBox = driver.findElement(By.id("passwd"));
		passwordTextBox.sendKeys("sansandy");
		WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
		loginButton.click();
//________________________________________________Purschase Functionality________________________________________________________
		WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		dresses.click();
		WebElement yellowDress = driver.findElement(By.xpath("(//a[contains(text(),'Printed Chiffon Dress')])[2]"));
		yellowDress.click();
		WebElement addQty = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		addQty.click();
		WebElement dressSize = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s1 = new Select(dressSize);
		s1.selectByValue("2");
		WebElement addToCart = driver.findElement(By.xpath("//button[@name='Submit']"));
		addToCart.click();
		WebElement checkOutbutton = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkOutbutton.click();
		WebElement finalCheckOutButton = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		finalCheckOutButton.click();
		WebElement proceedToCheckOut = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceedToCheckOut.click();
		WebElement checkBox = driver.findElement(By.id("cgv"));
		checkBox.click();
		WebElement checkOUT3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkOUT3.click();
		WebElement bankWireButton = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bankWireButton.click();
		WebElement confirmOrder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirmOrder.click();	
		WebElement back2Orders = driver.findElement(By.xpath("//a[contains(text(),'Back to orders')]"));
		back2Orders.click();
	}

}
