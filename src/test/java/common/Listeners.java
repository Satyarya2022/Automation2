package common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class Listeners implements ITestListener {
	ExtentReports extent = ExtentReportsClz.reports();
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		System.out.println("Tc started ");
		//Reporter.log("This method started execution - " + result.getName());
		//extent.createTest(result.getName());
		test =extent.createTest(result.getMethod().getMethodName());
		//test.log(Status.INFO, "TC started execution");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Tc failed ");
		//Reporter.log("The status of this method is - " + result.getStatus());
		test.fail(result.getThrowable());
		
		

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Tc Passed ");
		//Reporter.log("The status of this method is - " + result.getStatus());
		//test=extent.createTest(result.getMethod().getMethodName());
		test.log(Status.PASS, "Pass by extent report object");
	}

		
		public void onFinish (ITestContext context) {
			extent.flush();
		}
	}









