package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utility.SwagLab;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSwapLab {
	
	@Test(dataProvider="getData",dataProviderClass=SwagLab.class)
	public void verifyLogin(String Username,String Passward)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Passward);
		driver.findElement(By.id("login-button")).click();
		
		String Actual=driver.getCurrentUrl();
		
		Assert.assertEquals(Actual, "https://www.saucedemo.com/inventory.html");
	}
	

}
