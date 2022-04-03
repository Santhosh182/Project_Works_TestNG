package com.Testng_Group;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng_methods {
	@Ignore
	@Test(priority =2,groups = "loginpage", enabled = false )
	private void loginname() {
		// TODO Auto-generated method stub
	System.out.println("loginname");
	}
	@Test(priority = 1, groups = "loginpage")
	private void signup() {
		// TODO Auto-generated method stub
	System.out.println("Signup");
	}
	@Test(priority = 3,groups = "loginpage")
	private void password() {
		// TODO Auto-generated method stub
	System.out.println("Password");
	}
	@Test(priority = -1, invocationCount = 3)
	private void referesh() {
		// TODO Auto-generated method stub
	System.out.println("Referesh");
	}
	@Test(priority = -1, enabled = false)
	private void maximize() {
	System.out.println("Maximize");
	}
	@Test(priority = -2 )
	private void minimize() {
		// TODO Auto-generated method stub
	System.out.println("Minimize");
	}
	@Ignore
	@Test(priority = 4)
	private void time_out() {
		// TODO Auto-generated method stubS
	System.out.println("Timeout");
}
}