package common;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReportsClz {


	@BeforeTest
	public static ExtentReports reports() {

		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
		reporter.config().setReportName("Satya Automation Test Results");
		reporter.config().setDocumentTitle("QA Test Results");
	

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Satya QA");
		return extent;
	}
}