package ui;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerOnTestFailure extends BaseTest {
	// This class uses Base class to launch browser with Testng annotation, Uses
		// parameters for testdata,listeners to capture failure

	@Parameters({ "username", "password" })
	@Test
	public void launchappln(String username, String password) {
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		String expectedurl = "https://practice.expandtesting.com/secure";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl, "Testcase failed due to mismatch ");

	}

}





