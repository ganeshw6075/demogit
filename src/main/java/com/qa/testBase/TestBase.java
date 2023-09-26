package com.qa.testBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.SingInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		
	
	public static WebDriver driver;
	public static LoginPage l;
	public static SingInPage s;
	public static Logger logger;
	    @BeforeClass
	    public void startLogger()
	    {
	    logger=Logger.getLogger("TestBase");
	    PropertyConfigurator.configure("abc.properties");
	    System.out.println("Startlogger");
	    }
	    
		@BeforeMethod
		@Parameters({"br","url"})
		public void setUp(String br,String url)
		{

			if(br.equalsIgnoreCase("Chrome"))
			{    
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}
			else if (br.equalsIgnoreCase("Firefox"))
			{    
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
			}
			else if (br.equalsIgnoreCase("Edge"))
			{    
				WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
			}
			else
			{
				System.out.println("Please enter vaild browser");
			}
			
			logger.info("open the browser");
			//https://demo.guru99.com/selenium/newtours/
			driver.get(url);
			logger.info("lunch url");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		    l=new LoginPage(driver);
		    s=new SingInPage(driver);
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			logger.info("close the browser window");
		}
}

