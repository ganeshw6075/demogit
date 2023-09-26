package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("REGISTER")).click();
	    WebElement elment=driver.findElement(By.xpath("//select[@name=\"country\"]"));
	  
	    Select select=new Select(elment);
	    
	  //  select.selectByIndex(7);
	    select.selectByVisibleText("CAMBODIA");
	    //select.selectByValue("CAPE VERDE");
	    
	    driver.quit();
	}

}
