package com.retry_Testngmethod;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_Analyser_Implementations implements IRetryAnalyzer {
	int start = 1;
	int end =  3;
	public boolean retry(ITestResult result) {
	if (start<=end) {
		start++;
		return true;
	}
		return false;
	}

}
