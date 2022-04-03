package com.Testng_Anatotaion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annatotaion_Testng {

	
		// TODO Auto-generated method stub
@Test
private void login() {
	// TODO Auto-generated method stub
System.out.println("login");
}
@BeforeSuite
private void signup() {
	// TODO Auto-generated method stub
System.out.println("Signup");
}
@BeforeTest
private void password() {
	// TODO Auto-generated method stub
System.out.println("Password");
}
@BeforeClass
private void referesh() {
	// TODO Auto-generated method stub
System.out.println("Referesh");
}
@BeforeMethod
private void maximize() {
	// TODO Auto-generated method stub
System.out.println("Maximize");
}
@AfterSuite
private void minimize() {
	// TODO Auto-generated method stub
System.out.println("Minimize");
}
@AfterTest
private void time_out() {
	// TODO Auto-generated method stubS
System.out.println("Timeout");
}
@AfterClass
private void close() {
	// TODO Auto-generated method stub
System.out.println("Close");
}
@AfterMethod
private void quit() {
	// TODO Auto-generated method stub
System.out.println("Quit");
}
}


