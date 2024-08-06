package visionRA.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ListenersRA implements ITestListener  {
	public ExtentSparkReporter Report;//-- UI of the Report--//
	public ExtentReports extent;//-- Common Info--//
	 private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	    private Map<String, ExtentTest> classNodes = new HashMap<>();
	String Location = "D:\\Source code\\vision\\Reports\\RA_Report05_08.html";
	 public void onStart(ITestContext context) {
		   System.out.println("Execution of RA_Application started");
		   //-- Report Location--//
		   Report = new ExtentSparkReporter(Location);
		   //-- Doc Title--//
		   Report.config().setDocumentTitle("VAT_Report_RA");
		   //-- Name of the report--//
		   Report.config().setReportName("RA_Report");
//		   Report.config().setTheme(Theme.DARK);
		   extent = new ExtentReports();
		   extent.attachReporter(Report);
		   extent.setSystemInfo("L-6", "Sunoida");
		   extent.setSystemInfo("Testing", "QA");
		   extent.setSystemInfo("Name", "Guru Prasad M");
		   extent.setSystemInfo("Name", "Karthi MJ");
		  }
	 
	public  void onTestStart(ITestResult result) {
		 System.out.println("Execution Test started: " + result.getMethod().getMethodName());
	        String className = result.getTestClass().getName();
	        String methodName = result.getMethod().getMethodName();

	        ExtentTest classTest = classNodes.computeIfAbsent(className, k -> extent.createTest(className));
	        ExtentTest methodTest = classTest.createNode(methodName);
	        test.set(methodTest);
	  }
	
	 public  void onTestSuccess(ITestResult result) {
		  System.out.println("Execution Test Passed: " + result.getMethod().getMethodName());
	        ExtentTest currentTest = test.get();
	        if (currentTest != null) {
	            currentTest.log(Status.PASS, "Test Passed");
	        }
		  }
	 
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("Execution Test Failed: " + result.getMethod().getMethodName());
	        ExtentTest currentTest = test.get();
	        if (currentTest != null) {
	            currentTest.log(Status.FAIL, "Failed TestCase_ID " + result.getName());
	            currentTest.log(Status.FAIL, "Exception: " + result.getThrowable());
	            try {
	                attachScreenshotIfAvailable(result);
	            } catch (IOException e) {
	                currentTest.log(Status.FAIL, "Failed to capture screenshot: " + e.getMessage());
	            }
	        }
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Execution Test Skipped: " + result.getMethod().getMethodName());
	        ExtentTest currentTest = test.get();
	        if (currentTest != null) {
	            currentTest.log(Status.SKIP, "Skipped TestCase_ID " + result.getName());
	        }
	 }
	 
	 public void onFinish(ITestContext context) {
		 System.out.println("Execution of RA_Application Completed");
		 extent.flush();
		 
		  }
	 public static void reportTestDetails1(String screenName, String testCaseId, String notes) {
	        ExtentTest currentTest = test.get();
	        if (currentTest != null) {
	            currentTest.info("<b>Screen Name:</b>" + screenName);
	            currentTest.info("<b>Test Case ID:</b> " + testCaseId);
	            currentTest.info("<b>Description:</b> " + notes);
	        }
	    }
	 private void attachScreenshotIfAvailable(ITestResult result) throws IOException {
	        WebDriver driver = null;
	        Object testInstance = result.getInstance();
	        if (testInstance instanceof BaseClass) {
	            driver = ((BaseClass) testInstance).getDriver();
	        }

	        if (driver != null) {
	            String screenshotPath = captureScreenshot(driver, result.getMethod().getMethodName());
	            if (screenshotPath != null) {
	                ExtentTest currentTest = test.get();
	                if (currentTest != null) {
	                    currentTest.info("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	                }
	            }
	        }
	    }
	 private String captureScreenshot(WebDriver driver, String screenshotName) {
	        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File screenshotsDir = new File(System.getProperty("user.dir") + "\\Screenshots\\");
	        if (!screenshotsDir.exists()) {
	            screenshotsDir.mkdirs(); // Create directory if it does not exist
	        }
	        String location = screenshotsDir + "\\" + screenshotName + "_" + System.currentTimeMillis() + ".png";
	        File destinationFile = new File(location);
	        try {
	            org.apache.commons.io.FileUtils.copyFile(screenshotFile, destinationFile);
	            System.out.println(screenshotName + " Screenshot saved to: " + destinationFile.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println(screenshotName + " Failed to save screenshot: " + e.getMessage());
	        }
	        return location;
	    }
}

