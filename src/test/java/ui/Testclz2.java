package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclz2 {
	
	@Test
	public void tc1() {
		
		SoftAssert softassert = new SoftAssert();
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String expectedtitle= "Online sShopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualtitle = driver.getTitle();
		System.out.println("Verified title");
		softassert.assertEquals(actualtitle, expectedtitle);
		String actualurl= "https://www.amazon.in/";
		String expectedurl = driver.getCurrentUrl();
		softassert.assertEquals(actualurl, expectedurl);
		System.out.println("Verified Url");
		softassert.assertAll();
		
		 
	}

}
