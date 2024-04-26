package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsSample extends BaseTest {


	@Test
	public void testcase11() {
		driver.get("https://www.bingo.com");
		System.out.println(driver.getTitle());

	}

	@Test
	public void testcase22() {
		driver.get("https://www.msn.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);

	}


	@Test
	public void testcase33() {
		driver.get("https://www.ndtv.com");
		System.out.println(driver.getTitle());

	}

}
