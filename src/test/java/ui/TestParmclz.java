package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParmclz {
	public static WebDriver driver;
	
	@Parameters({"browser"}) 
	@Test 
	public void parameteriationtestcase( String browser) {
	
       if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
		}
           
		else if (browser.equals("chrome")) {
			 driver = new ChromeDriver();
		    WebDriverManager.chromedriver().setup();
		}
		
		
	    driver.get("http://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@name = 'login-button']")).click();
        driver.close();
              
	}

}


