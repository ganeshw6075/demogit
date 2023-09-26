package com.qa.testLayer;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;


public class TestLoginPage extends TestBase{
	
	@Test//(dataProvider="getData")
	public void  Verifylogin() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		l.clickRegLink();
		l.setFirstName("Ram");
		l.setLastName("Sharama");	
		l.setPhone("2674828487");
		l.setEmail("wableganesh115@gmail.com");
		l.setAddress("ram nagar");
		l.setCity("Delhi");
		l.setState("Delhi");
		l.setPostalCode("541267");
		l.setUserName("wableganesh115@gmail.com");
		l.setPassword("Ram@123");
		l.setConfirmPassword("Ram@123");
		l.clickSubmitLink();
		
		Thread.sleep(10000);
		WebElement s=driver.findElement(By.xpath("//b[contains(text(),'Note: Your user name is wableganesh115@gmail.com.')]"));
		System.out.println(s.isDisplayed());
		//Assert.assertTrue(s.isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/selenium/newtours/register_sucess.php");
		
//		logger.info("login verify successfully");
//		
//		LoginPage l=new LoginPage(driver);
//		l.clickRegLink();
//		l.setFirstName(fn);
//		l.setLastName(ln);	
//		l.setPhone(mo);
//		l.setEmail(mail);
//		l.setAddress(nagar);
//		l.setCity(city);
//		l.setState(state);
//		l.setPostalCode(pin);
//		l.setUserName(un);
//		l.setPassword(pass);
//		l.setConfirmPassword(cofpass);
//		l.clickSubmitLink();
//		Thread.sleep(10000);
////		WebElement s=driver.findElement(By.xpath("//b[contains(text(),'Note: Your user name is wableganesh115@gmail.com.')]"));
////		System.out.println(s.isDisplayed());
//		//Assert.assertTrue(s.isDisplayed());
//		Assert.assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/selenium/newtours/register_sucess.php");
//		
//		logger.info("login verify successfully");
	}
	
	
	//String fn,String ln,String mo,String mail,String nagar,String city,String state,String pin, String un,String pass,String cofpass
//	@DataProvider
//	public String[][] getData() throws Exception
//	{
//		File exc=new File("D:\\selenium driver and selenium\\Excel dataprovider\\Test.xlsx");
//		System.out.println(exc.exists());
//		FileInputStream fis=new FileInputStream(exc);
//	    XSSFWorkbook wb=new XSSFWorkbook(fis);
//	    XSSFSheet sheet=wb.getSheet("data");
//	    int noOfRows=sheet.getPhysicalNumberOfRows();
//	    System.out.println(noOfRows);
//	    System.out.println(sheet.getLastRowNum());
//	    int noOfColumns=sheet.getRow(0).getLastCellNum();
//	    System.out.println(noOfColumns);
//	    
//	    String [][] data=new String[noOfRows-1][noOfColumns];
//	    for(int i=0;i< noOfRows;i++)
//	    {
//	    	for(int j=0;j< noOfColumns-1;j++) {
//	    		DataFormatter df=new DataFormatter();
//	    		data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
//	    		 data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
//	    	}
//	    }
//	    wb.close();
//	    fis.close();
//	    
//	    return data;
//	}
	
}
