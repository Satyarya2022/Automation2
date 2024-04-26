package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclz1 {

	public static WebDriver driver;
	public static String browser = "firefox";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\janap\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
		} else if (browser.equals("chrome")) {
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
