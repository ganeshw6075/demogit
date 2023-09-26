package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SingInPage extends TestBase {
	
	public SingInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="SIGN-ON")
	WebElement signin ;
	
	@FindBy(name="userName")
	WebElement username ;
	
	@FindBy(name="password")
	WebElement password ;
	
	@FindBy(name="submit")
	WebElement submitlink ;
	
	@FindBy(linkText="Flights")
	WebElement flightlink;
	
	@FindBy(linkText="Hotels")
	WebElement hotelslink;
	
	@FindBy(linkText="Destinations")
	WebElement destinations;
	
	public void clickFlightlink()
	{
		flightlink.click();
		logger.info("click on flight");
	}
	
	public void clickHotelslink()
	{
		hotelslink.click();
		logger.info("click on hotel");
	}
	
	public void clickDestinationslink()
	{
		destinations.click();
		logger.info("click on destinations");
	}
	
	public void clickSignIn()
	{
		signin.click();
		logger.info("click on sign in");
	}
	
	public void userName(String name)
	{
		username.sendKeys(name);
		logger.info("enter username");
	}
	
	public void password(String name)
	{
		password.sendKeys(name);
		logger.info("enter password");
	}
	
	public void clickSubmit()
	{
		submitlink.click();
		logger.info("click on submit");
	}
}
