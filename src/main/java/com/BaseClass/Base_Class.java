package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class  {
	public static String value;
	public static WebDriver driver;
	public static WebDriver browserConfiguration(String type) {
		
if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe" );
	 driver = new ChromeDriver();
	
}
else if (type.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.geck.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe" );
	 driver = new FirefoxDriver ();
}
	return driver;
	}
		
public static void clickOnElement(WebElement element) {
	
element.click();
	
}
public static void enterInput(WebElement element, String data) {
	
element.sendKeys(data);
}
public static void close() {
	driver.close();

}
public static void getUrl(String url) {
	
	driver.get(url);
	

}
public static void dropDown(String type, WebElement element, String value) {
	Select s = new Select(element); 
	if (type.equalsIgnoreCase("byvalue")){
		s.selectByValue(value);
	}
	else if (type.equalsIgnoreCase("bytext")){

		s.selectByVisibleText(value);
		
	}
	else if (type.equalsIgnoreCase("byindex")) {
	int index = Integer.parseInt(value);
		s.selectByIndex(index);	
	}
}
public static void implicityWait(int seconds, TimeUnit format) {
	
driver.manage().timeouts().implicitlyWait(seconds,format);
}
public static void screenSnap(String path) throws IOException {
	// TODO Auto-generated method stub
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File (path);
FileUtils.copyFile(source, destination);
}
public static String get_Particular_data(String path, String sheetname, int rownum,int column) throws IOException {
File f = new File(path);
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
Sheet sheet = wb.getSheet(sheetname);
Row row = sheet.getRow(rownum);
Cell cell = row.getCell(column);
CellType type = cell.getCellType();

if (type.equals(CellType.STRING)) {
	
 value = cell.getStringCellValue();

	
}
else if (type.equals(CellType.NUMERIC)) {
	double d = cell.getNumericCellValue();
	int i = (int) d;
	value = Integer.toString(i);
}
	
return value;
}
}
