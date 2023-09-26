package pratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	
	
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    screenshot(driver,"tour1");
	    System.out.println("screenshot has been taken");

	}
   
	 public static void screenshot(WebDriver driver,String filename) throws Exception {
		    
		    TakesScreenshot ts=(TakesScreenshot)driver;
		    File fin=ts.getScreenshotAs(OutputType.FILE);
		    File target=new File("D:\\framework\\freeCrm\\Screenshot\\"+filename+".png");
		    FileHandler.copy(fin, target);
		    
		    }
}
