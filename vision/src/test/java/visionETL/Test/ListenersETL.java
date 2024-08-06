package visionETL.Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ListenersETL implements ITestListener {

    private ExtentSparkReporter reporter;
    private ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private Map<String, ExtentTest> classNodes = new HashMap<>();

   
    public void onStart(ITestContext context) {
        System.out.println("Execution of ETL_Application started");
        String reportPath = System.getProperty("user.dir") + "\\Reports\\ETL_Connector_Category_Report_05_Aug" +".html";
        reporter = new ExtentSparkReporter(reportPath);
        reporter.config().setDocumentTitle("VAT_Report_ETL");
        reporter.config().setReportName("ETL_Report");
//        reporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("L-6", "Sunoida");
		   extent.setSystemInfo("039", "Sunoida");
		   extent.setSystemInfo("Testing", "QA");
		   extent.setSystemInfo("Name", "Guru Prasad M");
		   extent.setSystemInfo("Name", "Karthiban MJ");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Execution Test started: " + result.getMethod().getMethodName());
        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();
        ExtentTest classTest = classNodes.computeIfAbsent(className, k -> extent.createTest(className));
        ExtentTest methodTest = classTest.createNode(methodName);
        test.set(methodTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Execution Test Passed: " + result.getMethod().getMethodName());
        ExtentTest currentTest = test.get();
        if (currentTest != null) {
            currentTest.log(Status.PASS, "Test Passed");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
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

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Execution Test Skipped: " + result.getMethod().getMethodName());
        ExtentTest currentTest = test.get();
        if (currentTest != null) {
            currentTest.log(Status.SKIP, "Skipped TestCase_ID " + result.getName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Execution of ETL_Application Completed");
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
