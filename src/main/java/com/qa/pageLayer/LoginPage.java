package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage  {

	public LoginPage(WebDriver driver)
	{   
	  	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Reglink;
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
    @FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="submit")
	WebElement sublink;
	
	public void clickRegLink()
	{
		Reglink.click();
		
	}
	
	
	public void setFirstName(String name)
	{
		firstName.sendKeys(name);
		
	}
	
	public void setLastName(String name)
	{
		lastName.sendKeys(name);
	}
	
	public void setUserName(String name)
	{
		userName.sendKeys(name);
	}
	public void setPhone(String name)
	{
		phone.sendKeys(name);
	}
	
	public void setAddress(String name)
	{
		address.sendKeys(name);
	}
	
	public void setCity(String name)
	{
		city.sendKeys(name);
	}
	
	public void setState(String name)
	{
		state.sendKeys(name);
	}
	public void setPostalCode(String name)
	{
		postalCode.sendKeys(name);
	}
	
	public void setEmail(String name)
	{
		email.sendKeys(name);
		
	}
	
	public void setPassword(String name)
	{
		password.sendKeys(name);
		
	}
	
	public void setConfirmPassword(String name)
	{
		confirmPassword.sendKeys(name);
		
	}
	
	public void clickSubmitLink()
	{
		sublink.click();
		
	}
}
