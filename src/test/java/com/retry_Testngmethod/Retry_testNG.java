package com.retry_Testngmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_testNG {
	@Test(retryAnalyzer = Iretry_Analyser_Implementations.class)
	private void login_details(String name, int pass) {
		// TODO Auto-generated method stub
		String expected_name = "air";
		String actual_name = "cat";
		Assert.assertEquals(expected_name, actual_name);
	}
	@Test (priority = -1, retryAnalyzer = Iretry_Analyser_Implementations.class)
	private void user_details(String name, int pass) {
		// TODO Auto-generated method stub
		String expected_pass = "bike";
		String actual_pass2 = "bike";
		Assert.assertEquals(expected_pass, actual_pass2);
}
}