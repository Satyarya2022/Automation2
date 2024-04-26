package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver=null;
	
	
	@BeforeSuite()
	public void launchbrowser()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
    @AfterTest()
    public void closebrowser() {
    	driver.close();
    	
    	
	
    	
    }
}
