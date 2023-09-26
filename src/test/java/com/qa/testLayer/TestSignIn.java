package com.qa.testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.pageLayer.SingInPage;
import com.qa.testBase.TestBase;


public class TestSignIn extends TestBase {
	
	@Test
	public void VerifySignin() throws InterruptedException 
	{
		s.clickSignIn();
		s.userName("skode761@gmail.com");
		s.password("Ram@123");
		s.clickSubmit();
		
		
		logger.info("signin verify successfully");
	}
	
	@Test
	public void VerifyFlightLink()
	{
		s.clickFlightlink();
		Assert.assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/selenium/newtours/reservation.php");
		logger.info("FlightLink verify successfully");
	}
	@Test
	public void VerifyHotelLink()
	{
		s.clickHotelslink();
		Assert.assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/selenium/newtours/support.php");
		logger.info("HotelLink verify successfully");
	}
	
//	public void VerifyDestinationsLink()
//	{
//		s.clickDestinationslink();
//		Assert.assertEquals(driver.getCurrentUrl(),"");
//		logger.info("DestinationsLink verify successfully");
//	}
	
//@DataProvider
//	
//	public Object[][] SignInData()
//	{
//		Object[][] data =new Object[4][2];
//		
//		data[0][0]="ske76@gmail.com";
//		data[0][1]="sham@123";
//		
//		data[1][0]="gg61@gmail.com";
//		data[1][1]="harsh@123";
//		
//		data[2][0]="skode761@gmail.com";
//		data[2][1]="Ram@123";
//		
//		data[3][0]="svede06@gmail.com";
//		data[3][1]="shubh@123";
//		
//		return data;
//		
//	}


}
