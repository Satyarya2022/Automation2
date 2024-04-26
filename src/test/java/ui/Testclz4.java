package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.DataProvidersDataclz;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclz4 extends DataProvidersDataclz {
	
	@Test(dataProvider="testdata1")
	public void testcase1 (String username , String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		driver.close();
	}

}
