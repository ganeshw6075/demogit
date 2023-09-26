package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlistener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execute successful method");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed"+result.getName());
		try {
			TakeScreenshot.screenshot(result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped method");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
