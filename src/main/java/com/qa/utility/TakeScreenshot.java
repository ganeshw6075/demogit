package com.qa.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class TakeScreenshot extends TestBase{

	
	 public static void screenshot(String filename) throws Exception {
		    
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File fin=ts.getScreenshotAs(OutputType.FILE);
		    File target=new File("D:\\framework\\freeCrm\\Screenshot\\"+filename+".png");
		    FileHandler.copy(fin, target);
		    
		    }
}
